import java.util.Scanner;
/**
 * Q10
 */
public class CountingLetters {
        public static void main(String[] args) {
            countingLetters();  //method call
            countingPairsOfLetters(); //method call
        }
        public static void countingLetters() {
            System.out.print("Enter some text please: ");
            // read some text from the user
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            System.out.print("Please enter a character to get the number of times it occurs in the "
                    + "previously inputted string: ");
            String charToCount = scanner.nextLine();

            // eliminate all 'e' characters then get the length of the resulting string
            System.out.println(input.length() - input.replace(charToCount, "").length());
        }

        /**
         * Q11
         */
        public static void countingPairsOfLetters() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter short text please: ");
            String shortText = scanner.nextLine();
            System.out.print("Enter longer text please: ");
            String longerText = scanner.nextLine();
            int count = 0;
            boolean shortTextInSubWord;

            // loop over longerText, letter by letter
            for (int i = 0; i <= longerText.length() - shortText.length(); i++) {
                shortTextInSubWord = true;
                // inner loop checks block of length shortText.length() from the given position in longerText
                for (int j = i; j < i + shortText.length(); j++) {
                    if (longerText.charAt(j) != shortText.charAt(j - i)) { //this checks equality
                        shortTextInSubWord = false;
                        break;
                    }
                }
                if (shortTextInSubWord) {
                    count++;
                }
            }
            System.out.printf("Short text occurred %d times", count);
        }
//j-i is 106-105 = 1

    }


