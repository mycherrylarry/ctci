package ArraysAndStrings.replace_space_with_20;

/**
 * Description: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string.
 * <p/>
 * Time Complexity:
 * Space Complexity:
 */
public class Solution {

    public void replaceSpace(char[] str, int size) {
        int spaceCount = 0;
        for (int i = 0; i < size; i++) {
            if (str[i] == ' ') spaceCount++;
        }
        if (spaceCount == 0) return;
        int newLength = size + spaceCount * 2;
        int p = newLength - 1;
        for (int i = size - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[p] = '0';
                str[p - 1] = '2';
                str[p - 2] = '%';
                p -= 3;
            } else {
                str[p] = str[i];
                p -= 1;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        char[] str = new char[100];
        str[0] =' ';
        str[1] ='a';
        str[2] =' ';
        str[3] ='b';
        str[4] ='c';
        str[5] =' ';
        s.replaceSpace(str, 6);
        System.out.println(str);
    }
}
