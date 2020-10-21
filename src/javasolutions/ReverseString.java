package javasolutions;

import java.util.Arrays;

// Reverse String
// https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/879/
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    // Solution
    public static void reverseString(char[] s) {
        if (s.length > 1) {
            int index = 0, reverseIndex = s.length - 1, end = s.length / 2;
            while(true) {
                char letter = s[reverseIndex];
                s[reverseIndex] = s[index];
                s[index] = letter;
                if (reverseIndex == end)
                    break;
                else {
                    index++;
                    reverseIndex--;
                }
            }
        }
    }
}
