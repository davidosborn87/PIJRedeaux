public class TutQ1 {
    public static void main(String args[]) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int currentYear = 2023;
        System.out.print("When were you born (year)? ");
        int birthYear = scan.nextInt();
        int ageAprox = currentYear - birthYear;
        String result = (ageAprox > 17) ? "" : "not ";
        System.out.println("It seems you are " + result + "an adult.");
    }
}
