

import java.util.Scanner;

/**
 * Our own version of boxed int!
 */
public class Integer2 {

    // ----------   field(s)  ----------
    private int value;

    // ----------   methods   ----------
    int getValue() {
        return this.value;
    }

    void setValue(int value) {
        this.value = value;
    }

    boolean isEven() {
        return this.value % 2 == 0;
    }

    boolean isOdd() {
        return !isEven();
    }

    void prettyPrint() {
        System.out.println(this.value);
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static void main(String[] args) {
        Integer2 i2 = new Integer2();
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        i2.setValue(i);
        System.out.print("The number you entered is ");
        if (i2.isEven()) {
            System.out.println("even.");
        } else if (i2.isOdd()) {
            System.out.println("odd.");
        } else {
            System.out.println("undefined!! Your code is buggy!");
        }
        int parsedInt = Integer.parseInt(i2.toString());
        if (parsedInt == i2.getValue()) {
            System.out.println("Your toString() method seems to work fine: " + i2);
        }
    }

}
