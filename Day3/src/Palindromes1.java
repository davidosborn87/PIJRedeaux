
public class Palindromes1 {
    public static void main(String[] args) {
        String[] passingInputs = {"", "A4", "!", "!!", "ABBA", "aBBA", " wooW", "!!!!!!aba"};
        String[] failingInputs = {"b  a ", "BaBa", "aba???a", "palindrome", "a!!!!bab$$$$$$ab$$$$$$ab"};

        System.out.println("Passing:");
        for (String input : passingInputs) {
            System.out.println(isPalindrome(input));
            System.out.println(createPalindrome(input));
            System.out.println(isRelaxedPalindrome(input));
        }
        System.out.println("\nFailing:");
        for (String input : failingInputs) {
            System.out.println(isPalindrome(input));
            System.out.println(createPalindrome(input));
            System.out.println(isRelaxedPalindrome(input));
        }
    }

    /**
     * Q14
     *
     * @param input the String to test
     * @return whether the input String is a palindrome
     */
    public static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Q15
     *
     * @param input the String with which a palindrome will be created
     * @return the created palindrome
     */
    public static String createPalindrome(String input) {
        StringBuilder inputBuilder = new StringBuilder(input);
        for (int i = inputBuilder.length() - 1; i > -1; i--) {
            inputBuilder.append(inputBuilder.charAt(i));
        }
        return inputBuilder.toString();
    }

    /**
     * Q16
     *
     * @param input the String to test
     * @return whether the input String is a relaxed palindrome
     */
    public static boolean isRelaxedPalindrome(String input) {
        char left, right;
        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            left = Character.toLowerCase(input.charAt(i));
            right = Character.toLowerCase(input.charAt(j));
            while (i < j && !Character.isLetter(left)) {
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
