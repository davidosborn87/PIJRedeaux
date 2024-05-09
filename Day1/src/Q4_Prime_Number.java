public class Q4_Prime_Number {
    public static void main(String[] args) {
        //Write a program that asks for a number from the user, then says whether the number is prime or not.
        //Remember that a prime number is a positive number (i.e., it is greater than 0) that is divisible only by
        //1 and itself. You can use the modulo operator (if a % b is zero, then a is divisible by b).
        System.out.println("This is a prime number detector; please enter a number to see if it is a prime one: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x = scan.nextInt();
        if (x == 1) {
            System.out.println("This is a prime number");
        }
            else {
            int n = 2;
                while (x % n != 0) {  //for as long as the operation is NOT divisible, will try next n:
                    n = n + 1;
                }  //when it becomes divisible this loop ends...then:
                if (n == x) {
                    System.out.println("This is a prime number");
                } else {
                    System.out.println("This is not a prime number");
                }
            }
        }
    }
