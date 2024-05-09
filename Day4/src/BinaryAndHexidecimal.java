

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Binary numbers can be quite long. A 32-bit memory address looks like 1001 0101 0110 1010 1011
 * 0010 1001 1010, which is difficult to handle. That is why memory addresses and other binary
 * numbers are usually written as hexadecimal numbers. A hexadecimal number is a base-16 number,
 * with digits between 0 and f (f is equivalent to decimal 15, e is equivalent to decimal 14, and so
 * on).<br>
 *
 * A hexadecimal number is equivalent to a four-digit binary number, which makes it quite compact.
 * The address from our example reads 956ab29a, which is easier to read and write. To prevent
 * confusion with decimal numbers, hexadecimal numbers are usually prefixed by "\0x", as in \0x95
 * (which is 149) or "\0xff" (which is 255).<br>
 *
 * Write a program that takes a String. The string can be a decimal or a hexadecimal number
 * (starting with \0x"). Your program must recognise the number as what it is and convert it to the
 * other base. Use two methods for conversion as in the previous exercise.
 */
public class BinaryAndHexidecimal {

    private static final int HEX_BASE = 16;
    private static final int HEX_DIGIT_LENGTH_IN_BINARY = 4;
    private static final String HEX_PREFIX = "\\0x";
    private static final List<String> conversionList = new ArrayList<>(
            Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e",
                    "f"));

    public static void main(String[] args) {
        // the program
        System.out.print("Please enter a positive hexidecimal or decimal number: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(convertBase(scanner.nextLine()));

        // unit tests (decimal to hex, then hex to decimal):
        System.out.println(convertBase("20")); // expected: \0x14
        System.out.println(convertBase("255")); // expected: \0xff
        System.out.println(convertBase(String.valueOf(Integer.MAX_VALUE))); // expected: \0x7fffffff
        System.out.println(convertBase(String.valueOf(Long.MAX_VALUE))); // expected: \0x7fffffff

        System.out.println(convertBase(HEX_PREFIX + "14")); // expected: 20
        System.out.println(convertBase(HEX_PREFIX + "ff")); // expected: 255
        System.out.println(convertBase(HEX_PREFIX + "7fffffff")); // expected: 2147483647
        System.out.println(convertBase(HEX_PREFIX + "7fffffffffffffff")); // expected: 9223372036854775807
    }

    /**
     * A method which converts a String representation of either a decimal or hexidecimal number and
     * outputs a String representation of the number when converted to the other of the two
     * aforementioned bases.
     *
     * @param number a String representation of a positive integer
     * @return a String representation of the inputted number, with its base converted
     */
    public static String convertBase(String number) {
    /*
     perform some basic validations on the input (note, these are not comprehensive, but serve as
     an indicative nod to best practices)
    */
        if (Objects.isNull(number) || number.isBlank() || number.startsWith("-")) {
            return "Invalid input: the provided number must be a positive integer";
        }
        return number.startsWith(HEX_PREFIX) ? convertHexToDecimal(number)
                : convertDecimalToHex(number);
    }

    private static String convertHexToDecimal(String number) {
        String[] individualDigits = number.replace(HEX_PREFIX, "").split("");
        long currentDigitDecimalValue;
        long total = 0;
        for (int i = 0; i < individualDigits.length ; i++) {
            currentDigitDecimalValue = conversionList.indexOf(individualDigits[i]);
            total += leftShiftDigitValue(currentDigitDecimalValue,
                    individualDigits.length, i);
        }
        return String.valueOf(total);
    }

    private static long leftShiftDigitValue(long decimalValue, int inputNumberLength, int magnitude) {
    /*
     The following makes use of the left shift, bitwise operator to shift the number's binary bits
     to the left. See: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html
    */
        return decimalValue << (HEX_DIGIT_LENGTH_IN_BINARY * (inputNumberLength - (magnitude + 1)));
    }

    private static String convertDecimalToHex(String number) {
        long intNum = Long.parseLong(number);
        StringBuilder stringBuilder = new StringBuilder(HEX_PREFIX);
        while (intNum > 0) {
            stringBuilder.insert(HEX_PREFIX.length(), conversionList.get((int) (intNum % HEX_BASE)));
            intNum /= HEX_BASE;
        }
        return stringBuilder.toString();
    }


}
