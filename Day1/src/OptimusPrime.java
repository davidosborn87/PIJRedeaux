//Write a program that reads an integer number from the user, and then outputs the closest prime
//number. If there are two prime numbers at the same distance, it should output both. For instance,
//if the user enters 5116, the output should be 5113 and 5119.

//if I inout 8, I get 7; if 12, 11 & 13

import java.util.Scanner;

public class OptimusPrime {

    public static void main(String[] args) {
        getNearestPrime();
    }

    public static void getFirst1000Primes() {
        int count = 0;
        int i = 0;
        while (count < 7) {
            if (isPrime(++i)) {
                count++;
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int potentialPrime) {
        if (potentialPrime < 1) {
            return false;
        }
        // skip 1
        for (int i = 2; i < potentialPrime; i++) {
            if (potentialPrime % i == 0) {
                return false;
            }
        }
        return true;
    }


    private static void getNearestPrime() {
        System.out.print("Enter a positive integer to get its nearest prime(s): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;

        if (isPrime(n)) {
            System.out.println(n);
            return;
        }
        boolean primeFound = false;
        while (!primeFound) {
            if (isPrime(n - count)) {
                System.out.print("Closest prime: " + (n - count));
                primeFound = true;
            }
            if (isPrime(n + count)) {
                System.out.println("Closest prime: " + (n + count));
                primeFound = true;
            }
            count++;
        }
    }
}