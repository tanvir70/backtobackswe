package swe.Strings;

import java.util.*;

public class PatternMatching {
    public static List<String> findPattern(String[] words, String pattern) {
        List<String> output = new ArrayList<>();
        for (String word : words) {
            if (word.length() != pattern.length()) {
                continue;
            }
            Map<Character, Character> charMap = new HashMap<>();
            Boolean isValid = true;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                char p = pattern.charAt(i);
                if (!charMap.containsKey(c) && !charMap.containsValue(p)) {
                    charMap.put(c, p);
                } else if (charMap.containsKey(c) && charMap.get(c) == p) {
                    continue;
                } else {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                output.add(word);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String[] array = {"foo", "bar", "baz", "bat"};
        String str = "abb";
        System.out.println(findPattern(array,str));
    }
}
