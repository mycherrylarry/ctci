package ArraysAndStrings.reverse_chars;

/**
 * Description: Implement a function void reverse(char* str) which reverses a null-terminated string.
 * Time Complexity:
 * Space Complexity:
 */
public class Solution {

    /**
     * reverse half of the string
     *
     * @param chars
     */
    public void reverse(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        char[] chars = {'a', 'b', 'c'};
        System.out.println(chars);
        s.reverse(chars);
        System.out.println(chars);
    }
}
