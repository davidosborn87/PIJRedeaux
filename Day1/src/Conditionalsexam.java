public class Conditionalsexam {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("What was your overall potential score?");
        int examMark = scan.nextInt();
        if (examMark >= 70) {
            System.out.println("An exceptional result!");
            System.out.println("We expect a first-class project from you.");
        }
        else if (examMark >= 50) {
            System.out.println("A satisfactory result!");
            System.out.println("You may proceed with your project.");

        } else {
            System.out.println("Sorry, you have failed.");
        }
    }
}
