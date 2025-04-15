package Q02ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "anagram";
        String t = "nagaram";

        boolean result = solution.isAnagram(s, t);
        System.out.println("Is Anagram: " + result); // true
    }

    public boolean isAnagram(String s, String t) {
        // Uzunluklar eşit değilse, direkt false döneriz
        if (s.length() != t.length()) {
            return false;
        }

        // Harf sayısı için bir map tutuyoruz
        Map<Character, Integer> countMap = new HashMap<>();

        // s'deki her harfi map'e ekliyoruz
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // t'deki her harf için sayacı azaltıyoruz
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c)) {
                return false;
            }

            countMap.put(c, countMap.get(c) - 1);
            // Eğer sayı sıfırın altına düşerse anagram değildir

            if (countMap.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}