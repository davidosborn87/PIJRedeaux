public class Calculator2 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter two numbers yo");
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double c;
        System.out.println("Cheers mate; now what kind of operation do you want to do on them?");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 0 for oblivion");
        int choice;
        while (true) {
            choice = scan.nextInt();
            if (choice == 0){
                break;
            }
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
                    System.out.print("Invalid operation, please enter an integer between 0 and 4");
                    break;
            }
        }System.out.print("Maeve is lame");
    }
}