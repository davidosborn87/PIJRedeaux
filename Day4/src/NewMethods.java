public class NewMethods {
    public static void main(String[] args) {
    }
    java.util.Scanner scan = new java.util.Scanner(System.in);
    String login = scan.nextLine();
    static boolean containsOnlyLowerCaseLetters(String login) {
        boolean result = true;
        int i = 0;
        while (i < login.length()) {
            char c = login.charAt(i);
            if (!Character.isLetter(c) || !Character.isLowerCase(c)) {
                result = false;
                }
            i++;
            }
        return result;
        }
}
