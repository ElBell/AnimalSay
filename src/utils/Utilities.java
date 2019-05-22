package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utilities {
    public static String repeat(String aString, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i += 1) {
            sb.append(aString);
        }
        return sb.toString();
    }
    
    public static int getLongestLineLength(String[] lines) {
        int maxLength = lines[0].length();
        for (String line: lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }
        return maxLength;
    }
    
    public static String[] wrap(String message, int maxWidth) {
        List<String> fragments = new ArrayList<String>();
        for (int i=0; i<maxWidth; i+= message.length()) {
            String chunk = message.substring(i, message.length());
            String[] lines = chunk.split("\n");
            fragments.addAll(Arrays.asList(lines));
        }
        String[] fragmentsAsArray = new String[fragments.size()];
        fragments.toArray(fragmentsAsArray);
        return fragmentsAsArray;
    }
}
