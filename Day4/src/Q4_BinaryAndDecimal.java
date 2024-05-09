//Create a program in which you define the following methods:
//power(int, int): Takes a base b and an exponent e from the user, and returns the result of b exp e
//power2(int): Takes an exponent e from the user and returns the result of 2e
public class Q4_BinaryAndDecimal {
    public static void main(String[] args) {
        System.out.println(power(4,4));
        System.out.println(power(2,4));
        System.out.println(power(6,4));
        System.out.println(power(10, 10));
        System.out.println(power(100000, 0));
        System.out.println(power(10, -4));
        java.util.Scanner sc = new java.util.Scanner(System.in);

    }

    static double power(int base, int exponent) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double result = base;
        if (exponent == 0) return 1;
        for (int i = 1; i < exponent; i++) {
            result = result * base;



        }
        return result;
    }
}










