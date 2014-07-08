package ArraysAndStrings.permutation;

/**
 * Description: Given two strings, write a method to decide if one is a permutation of the other.
 * Time Complexity:
 * Space Complexity:
 */
public class Solution {

    /**
     * Assume that str1 is in ASCII encoding
     *
     * @param str1
     * @param str2
     * @return
     */
    public boolean permutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] chars = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            chars[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (--chars[str2.charAt(i)] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String str1 = "abac";
        String str2 = "cbaa";
        System.out.println(s.permutation(str1, str2));
    }
}
