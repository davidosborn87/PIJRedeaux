import java.util.Scanner;

public class StrictPalindrome {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter a string to test for strict and relaxed pallindromosity: ");
        String input = scan.nextLine();
        boolean strictpalindrome = isPalindrome(input);  //calls method isPalindrome
        boolean relaxedpalindrome = isRelaxedPalindrome(input);
        System.out.println("Is strict palindrome? " + strictpalindrome);
        System.out.println("Is relaxed palindrome? " + relaxedpalindrome);
    }


    public static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - (i + 1))) { //on first iteration, this compares
                // first character with last one; on second iteration, compares second character with second-last one
                //stops at mid-point and ignores the middle letter if odd.
                return false;
            }
        }
        return true;
    }


    public static boolean isRelaxedPalindrome(String input) {
        char left, right;
        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {//i is beginning, j is end; every loop, scans one
            //step closer to the centre
            left = Character.toLowerCase(input.charAt(i)); //as it loops, lowercases all the characters
            right = Character.toLowerCase(input.charAt(j));
            while (i < j && !Character.isLetter(left)) {//until it meets in the middle & until the scanned character is the one at i:
                left = Character.toLowerCase(input.charAt(i++));
            }
            while (i < j && !Character.isLetter(right)) {
                right = Character.toLowerCase(input.charAt(j--));
            }
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}