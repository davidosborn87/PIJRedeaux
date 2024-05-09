//Write a program that reads two numbers from the user and then offers a menu with the four basic
//operations: addition, subtraction, multiplication, and division. Once the user has selected an operation
//from the menu, the calculator performs the operation.
//Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is
//also a Double.parseDouble() method to parse real numbers. Similarly, class java.util.Scanner has
//a method nextDouble().



public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter two numbers yo");
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c = 0;
        System.out.println("Cheers mate; now what kind of operation do you want to do on them?");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        int choice;
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                c = a + b;
                System.out.println(c);
                break;
            case 2:
                c = a - b;
                System.out.println(c);
                break;
            case 3:
                c = a * b;
                System.out.println(c);
                break;
            case 4:
                c = a / b;
                System.out.println(c);
                break;
            default:
                System.out.print("Invalid operation, ending program");
                break;
        }
    }
}