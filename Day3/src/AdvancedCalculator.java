public class AdvancedCalculator {


    //decimal2binary(double): The opposite of the previous one: takes a decimal number and returns the corresponding
// binary number. Hint: instead of multiplying by 2, you will need to divide by 2 this
//time (the quotients and the last remainder will give you the binary number).
//The program must offer a menu to the user with two options. The first one takes a binary number
//from the user and returns the corresponding decimal number. The second one does the opposite:
//takes a decimal number and returns a binary number. The program should use the methods that you
//have defined.

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Welcome to the immensely frustrating yet useful bi-directional binary calculator");


        while (true) {
            System.out.println("For decimal to binary, press 0; \nFor binary to decimal, press 1; \nFor decimal exponent calculation, press 2; \n" +
                    "To obtain the decimal value of 2Exp n, press 3");
            int choice = scan.nextInt();
            switch (choice) {
                case 0:
                    System.out.print("Please enter a decimal number to convert to binary.");
                    double decimal2Binary = scan.nextDouble();
                    // double binary2decimalExponent = scan.nextInt();
                    System.out.println("Testing output  " + decimal2Binary(decimal2Binary));

                    break;
                case 1:
                    System.out.print("Enter a binary number to obtain its decimal number: ");
                    String binary01Decimal = scan.next();
                    System.out.println("Testing output  " + binary2decimal(binary01Decimal));
                    break;
                case 2:
                    System.out.println("First enter the base, followed by the exponent. This cannot be used for scientific notation");
                    double base = scan.nextDouble();
                    int exponent = scan.nextInt();
                    System.out.println(power(base, exponent));
                    break;
                case 3:
                    System.out.println("Enter the power of 2 you wish to decimalise");
                    double exp = scan.nextDouble();
                    System.out.println(binaryPower(exp));
                    break;
                case 4:
                    System.out.println("First enter the coefficient, followed by the exponent. This will deliver correctly rounded scientific notation.");
                    double coefficient = scan.nextDouble();
                    int exponent2 = scan.nextInt();
                    System.out.println(scientificNotationToDecimal(coefficient,exponent2));
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }

    public static double scientificNotationToDecimal(double coefficient, int exponent) {
        double result = 1;
        if (exponent == 0) return coefficient;
        if (exponent < 0) {
            for (double i = 0; i > exponent; i--) {
                result = result / 10;
            }
        }
         if (exponent > 0) {
         for (int i =0; i<exponent; i++){
         result = result * 10;
                                        }
        }
        return coefficient * result;
    }
    public static double decimal2Binary(double decimalNum) {
        double decimalNumNextSequence = decimalNum;
        double sequence = 1;
        double result = 0;
        for (double i = 1; i < decimalNum && decimalNumNextSequence != 0; i++) {
            double binaryDigit = decimalNumNextSequence % 2;  //SAME           1
            decimalNumNextSequence = decimalNumNextSequence / 2; //SAME2    3
            result = result + binaryDigit * sequence;
            sequence = sequence * 10;
        }
        return result;
    }


    public static double zeroOrOne(String binary2decimal) {

        char binarydigit;
        for (int i = 0, j = binary2decimal.length() - 1; i < j; i++, j--) {
            binarydigit = Character.toLowerCase(binary2decimal.charAt(i));

            while (i < j && !Character.isLetter(binarydigit)) {
                binarydigit = Character.toLowerCase(binary2decimal.charAt(i++));
                if (binarydigit == 49) { //if 1

                }
                if (binarydigit == 48) ;
            }

        }
        return 0;
    }

    static double binary2decimal(String binaryNum) {
        double decimalNum = 0;
        double strSize = binaryNum.length();
        for (int i = 0; i < strSize; i++) {
            char binaryChar = binaryNum.charAt(i); //binaryChar will be 48 or 49
            double binaryCharNum = binaryChar - '0'; //- '0' means minus 48.
            double power = binaryPower(strSize - 1 - i);
            decimalNum = (double) (decimalNum + power * binaryCharNum);
        }
        return decimalNum;
    }

    public static double binaryPower(double exponent) {
        return power(2, exponent); //this line calls on method power. So...puts the input through method power but with base fixed to 2.
    }

    public static double power(double base, double exponent) {
        double result = base;
        if (exponent == 0) return 1;
        if (exponent < 0) {
            for (double i = 1; i > exponent; i--) {
                result = result / base;
            }
        }
        if (exponent > 1) {
            for (double i = 1; i < exponent; i++) {
                result = result * base;
            }
        }
     /*   String sciNoteNum = String.valueOf(result);
        String sciNoteBase = String.valueOf(base);
        int lengthOfBase = sciNoteBase.length();
        int positionOfDotInAnswer = 0;
        int numbersAfterDecimal = 0;
        if (sciNoteBase.contains(".")){
            lengthOfBase--;
            for (int i = lengthOfBase-1; i>0; i--){
                numbersAfterDecimal++;
                if (sciNoteBase.charAt(i)=='.'){
                    break;
                }
            }
            for (int i = 0; i<sciNoteNum.length(); i++){
                positionOfDotInAnswer++;
                if (sciNoteNum.charAt(i) == '.'){
                    break;
                }
            }
             sciNoteNum = String.valueOf(result).substring(0, positionOfDotInAnswer + numbersAfterDecimal);
             result = Double.parseDouble(sciNoteNum);
        }*/

        return result;
    }
}
    