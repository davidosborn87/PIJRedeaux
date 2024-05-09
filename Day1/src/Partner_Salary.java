
public class Partner_Salary {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x, y;
        System.out.println("Welcome; What is your salary?: ");
        x = scan.nextInt();
        System.out.println("And your partners'?: ");
        y = scan.nextInt();
        if (x + y >= 40000) {
            System.out.println("You shall be taxed to death");
        }else
            System.out.println("Lol you po");

    }
}

