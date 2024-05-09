

import java.util.Scanner;

/**
 * Q13<br>
 * Write a program that reads the total cost of a purchase and an amount of money that is paid to buy
 * it. Your program should output the correct change specifying the amount of notes (50, 20, 10, 5) and
 * coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01) needed.
 */
public class YourChangePlease {

    public static void main(String[] args) {
        // set the program in motion
        yourChangePlease();
    }

    private static void yourChangePlease() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the total cost of purchase: ");
        double purchasePrice = scanner.nextDouble();

        System.out.print("Please enter the amount paid for the purchase: ");
        double amountPaid = scanner.nextDouble();

        // work out total change required
        double change = (double) Math.round((amountPaid - purchasePrice) * 100) / 100 ;

        // work out notes/coins to return
        double[] noteArray = {50, 20, 10, 5};
        double[] coinArray = {2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        // one approach: setup a double variable and keep adding notes and coins to it until the variable
        // equals change
        int[] noteCount = new int[noteArray.length];
        int[] coinCount = new int[coinArray.length];

        change = populateCountArray(noteArray, change, noteCount);
        populateCountArray(coinArray, change, coinCount);

        // change: 60
        // Notes: 50 x 1, 10 x 1
        System.out.print("Notes: ");
        for (int i = 0; i < noteCount.length; i++) {
            if (noteCount[i] > 0) {
                // only output instances where individual notes are being returned
                System.out.printf("%d x %d, ", (int) noteArray[i], noteCount[i]);
            }
        }
        System.out.print("\nCoins: ");
        for (int i = 0; i < coinCount.length; i++) {
            if (coinCount[i] > 0) {
                // only output instances where individual notes are being returned
                System.out.printf("%.2f x %d, ", coinArray[i], coinCount[i]);
            }
        }
    }

    private static double populateCountArray(double[] denominationsArray, double change,
                                             int[] denominationCount) {
        for (int i = 0; i < denominationsArray.length && change > 0; i++) {
            // e.g. change = 110
            int numberOfTimesNoteGoesIntoChange = (int) (change / denominationsArray[i]);
            denominationCount[i] = numberOfTimesNoteGoesIntoChange;
            change -= denominationsArray[i] * numberOfTimesNoteGoesIntoChange;
        }
        return change;
    }


}

