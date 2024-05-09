//Write a program that reads a text representing a mathematical operation (one of the four basic ones)
//with two operands, and then executes it. For example, if the user enters “3/5” the program outputs “0.6”;
// if the user enters “23 * 4” the program outputs “92”.

public class Calculator3CommandLine {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter a mathematical operation");
        String a = scan.nextLine();
        String top = a.substring(0,1);
        String operator = a.substring(1,2);
        String bottom = a.substring(2,3);
        System.out.println(a);
        System.out.println(top);
        System.out.println(operator);
        System.out.println(bottom);
    }
}

