package ArraysAndStrings.unique_characters;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */
public class Solution {
    /**
     *
     * @note Assume that all characters are in ASCII encoding (total 256)
     * @param str
     * @return
     */
    public boolean uniqueCharacters(String str) {
        boolean[] ascii = new boolean[256];
        for(int i=0; i < str.length(); i++) {
            if(ascii[str.charAt(i)]) return false;
            ascii[str.charAt(i)] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.uniqueCharacters("abcdd"));
        System.out.println(s.uniqueCharacters("abcde"));
    }
}
