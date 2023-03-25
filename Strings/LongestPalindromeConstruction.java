package swe.Strings;

import java.util.*;
public class LongestPalindromeConstruction {
    public int longestPalindrome(String str) {
        Set<Character> unmatchedCharacter = new HashSet<>();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (unmatchedCharacter.contains(c)) {
                count++;
                unmatchedCharacter.remove(c);
            } else {
                unmatchedCharacter.add(c);
            }
        }
        int length = count * 2;
        if (!unmatchedCharacter.isEmpty()) {
            length++;
        }
        return length;
    }
}
