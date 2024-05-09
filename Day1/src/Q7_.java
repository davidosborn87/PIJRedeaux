public class Q7_ {
    public static void main(String[]args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter 1: ");
        num1 = scan.nextInt();
        System.out.print("Enter 2: ");
        num2 = scan.nextInt();
        System.out.print("Enter 3: ");
        num3 = scan.nextInt();
        if(num1 > num2 && num1 > num3) {
            if(num2 > num3) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else {System.out.println(num2 + " " + num3 + " " + num1);
            }
        }
    }
}
