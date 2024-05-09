//Write a program that requests two numbers from the user and then outputs their product. You cannot use the “*” operator.
//Can you make your program work correctly also if one or both numbers are negative?

// Correct

public class Q5_Multiplication {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x, y, sum = 0;
        System.out.println("Welcome; enter a value for x: ");
        x = scan.nextInt();
        System.out.println("Welcome; enter a value for y: ");
        y = scan.nextInt();
        while(y!=0){
            sum = sum + x;
            y = y-1;
        }
        System.out.println(sum);
    }
}
