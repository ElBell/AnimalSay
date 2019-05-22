package utils;

import java.util.*;

public class Utilities {
    private static final int MAXWIDTH = 30;
    public static String repeat(String aString, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i += 1) {
            sb.append(aString);
        }
        return sb.toString();
    }
    
    public static int getLongestLineLength(List<String> lines) {
        String longestLine = Collections.max(lines, Comparator.comparing(String::length));
        return longestLine.length();
    }
    
    public static List<String> wrap(String message) {
        List<String> lines = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        for (String s : message.split(" ")) {
            if(currentLine.length() + s.length() > MAXWIDTH) {
                lines.add(currentLine.toString());
                currentLine = new StringBuilder(s).append(" ");
            } else {
                currentLine.append(s).append(" ");
            }
        }
        lines.add(currentLine.toString());
        return lines;
    }
}
