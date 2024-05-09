import java.util.Scanner;

//decimal2binary(int): The opposite of the previous one: takes a decimal number and returns the corresponding
// binary number. Hint: instead of multiplying by 2, you will need to divide by 2 this
//time (the quotients and the last remainder will give you the binary number).
//The program must offer a menu to the user with two options. The first one takes a binary number
//from the user and returns the corresponding decimal number. The second one does the opposite:
//takes a decimal number and returns a binary number. The program should use the methods that you
//have defined.
public class Q4_teacherVersion {
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
                    int decimal2Binary = scan.nextInt();
                    // int binary2decimalExponent = scan.nextInt();
                    System.out.println("Testing output  " + decimal2Binary(decimal2Binary));

                    break;
                case 1:
                    System.out.print("Enter a binary number to obtain its decimal number: ");
                    String binary01Decimal = scan.next();
                    System.out.println("Testing output  " + binary2decimal(binary01Decimal));
                    break;
                case 2:
                    System.out.println("First enter the base, followed by the exponent. This cannot be used for scientific notation");
                    int base = scan.nextInt();
                    int exponent = scan.nextInt();
                    System.out.println(power(base, exponent));
                    break;
                case 3:
                    System.out.println("Enter the power of 2 you wish to decimalise");
                    int exp = scan.nextInt();
                    System.out.println(binaryPower(exp));
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }

        //System.out.println(binary2decimal(binary2decimal));
        // System.out.println("Testing output  " + decimal2Binary(1));
        // System.out.println("Testing output  " + decimal2Binary(3));



    }
    public static int decimal2Binary(int decimalNum) {
        int decimalNumNextSequence = decimalNum;
        int sequence = 1;
        int result = 0;
        for (int i = 1; i < decimalNum && decimalNumNextSequence != 0; i++) {
            int binaryDigit = decimalNumNextSequence % 2;  //SAME           1
            decimalNumNextSequence = decimalNumNextSequence / 2; //SAME2    3
            result = result + binaryDigit * sequence;
            sequence = sequence *10;
        }
        return result;
    }



    public static int zeroOrOne(String binary2decimal) {

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

    static int binary2decimal(String binaryNum) {
        int decimalNum = 0;
        int strSize = binaryNum.length();
        for (int i = 0; i < strSize; i++) {
            char binaryChar = binaryNum.charAt(i); //binaryChar will be 48 or 49
            int binaryCharNum = binaryChar - '0'; //- '0' means minus 48.
            double power = binaryPower(strSize -1 - i);
            decimalNum = (int) (decimalNum + power*binaryCharNum);
        }
        return decimalNum;
    }
    public static double binaryPower(int exponent){
        return power(2, exponent); //this line calls on method power. So...puts the input through method power but with base fixed to 2.
    }
    public static double power(int base, int exponent) {
        double result = base;
        if (exponent == 0) return 1;
        if (exponent<0) {
            for (int i = 1; i>exponent; i--) {
                result = result/base;
            }
        }
        if (exponent>1) {
            for (int i = 1; i < exponent; i++) {
                result = result * base;
            }
        }
        return result;
    }
}
