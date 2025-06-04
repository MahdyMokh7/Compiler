package main.Preprocessor;

import java.io.*;
import java.util.*;

public class CPyPreprocessor {
    private static final int INDENT_SIZE = 4;

    public static String preprocess(String filePath) throws IOException {
        List<String> outputLines = new ArrayList<>();
        Stack<Integer> indentStack = new Stack<>();
        indentStack.push(0);

        String previousNonBlank = null;
        boolean previousWasBlockClose = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String trimmed = line.trim();
                int currentIndent = countIndent(line);

                boolean isEnd = trimmed.equals("end");
                boolean isElseIf = trimmed.matches("else if\\s*\\(.*\\):");
                boolean isElse = trimmed.equals("else:");
                boolean isControlFlowContinuation = isElseIf || isElse;
                boolean isBlankLine = trimmed.isEmpty();

                // Dedent or "end"
                if (!isBlankLine && ((currentIndent < indentStack.peek()) || isEnd)) {
                    while ((currentIndent < indentStack.peek()) || isEnd) {
                        indentStack.pop();
                        outputLines.add(getIndent(indentStack.peek()) + "}");
                        previousWasBlockClose = true;
                        if (isEnd) break;
                    }
                    if (isEnd) continue;
                }

                // Handle blank line with lookahead
                if (isBlankLine) {
                    reader.mark(2000);
                    String peek;
                    while ((peek = reader.readLine()) != null && peek.trim().isEmpty()) {
                        // skip multiple blank lines
                    }
                    reader.reset();

                    if (peek != null) {
                        int nextIndent = countIndent(peek);
                        boolean nextIsEnd = peek.trim().equals("end");
                        if (nextIndent < indentStack.peek() || nextIsEnd) {
                            // skip this blank line before dedent or end
                            continue;
                        }
                    }

                    // Otherwise preserve the blank line if it's between statements
                    if (previousNonBlank != null && !previousNonBlank.endsWith("{") && !previousNonBlank.equals("}")) {
                        outputLines.add("");
                    }
                    continue;
                }

                // Handle else if
                if (isElseIf) {
                    String header = trimmed.replaceFirst(":\\s*$", " {");
                    if (previousWasBlockClose && !outputLines.isEmpty()) {
                        String last = outputLines.remove(outputLines.size() - 1);
                        outputLines.add(last + " " + header);
                    } else {
                        outputLines.add(getIndent(currentIndent) + header);
                    }
                    indentStack.push(currentIndent + INDENT_SIZE);
                    previousWasBlockClose = false;
                    previousNonBlank = header;
                    continue;
                }

                // Handle else
                if (isElse) {
                    if (previousWasBlockClose && !outputLines.isEmpty()) {
                        String last = outputLines.remove(outputLines.size() - 1);
                        outputLines.add(last + " else {");
                        previousNonBlank = last + " else {";
                    } else {
                        outputLines.add(getIndent(currentIndent) + "else {");
                        previousNonBlank = "else {";
                    }
                    indentStack.push(currentIndent + INDENT_SIZE);
                    previousWasBlockClose = false;
                    continue;
                }

                // Handle block start (e.g., if, while, for, etc.)
                if (trimmed.endsWith(":")) {
                    String header = trimmed.replaceFirst(":\\s*$", " {");
                    outputLines.add(getIndent(currentIndent) + header);
                    indentStack.push(currentIndent + INDENT_SIZE);
                    previousWasBlockClose = false;
                    previousNonBlank = header;
                    continue;
                }

                // Handle normal statements
                String fullStatement = getIndent(currentIndent) + trimmed + ";";
                outputLines.add(fullStatement);
                previousWasBlockClose = false;
                previousNonBlank = fullStatement;
            }

            // Close remaining open blocks
            while (indentStack.size() > 1) {
                indentStack.pop();
                outputLines.add(getIndent(indentStack.peek()) + "}");
            }
        }

        return String.join("\n", outputLines);
    }

    private static int countIndent(String line) {
        int count = 0;
        for (char ch : line.toCharArray()) {
            if (ch == ' ') count++;
            else if (ch == '\t') count += INDENT_SIZE;
            else break;
        }
        return count;
    }

    private static String getIndent(int spaces) {
        return " ".repeat(spaces);
    }
}
// the 10 out of 11 test cases