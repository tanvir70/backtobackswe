package swe.Strings;

import java.util.*;
public class ReplaceWithPrefix {
    public String replaceWordsWithPrefix(String[] prefixes, String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Boolean> mapping = new HashMap<>();
        for (int i = 0; i < prefixes.length; i++) {
            mapping.put(prefixes[i], true);
        }
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (mapping.get(word.substring(0, j)) != null) {
                    words[i] = word.substring(0, j);
                    break;
                }
            }
        }
        return String.join(" ", words);
    }
}

