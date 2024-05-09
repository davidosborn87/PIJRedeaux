import java.util.Scanner;

public class Pi {


    public static void main(String[] args) {
        getPartialAdditionByNumberOfTerms();
    }

    private static void getPartialAdditionByNumberOfTerms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int bottom;
        double result = 0;

        for (int i = 0; i < n; i++) {
            bottom = i * 2 + 1;
            // add the calculated term to result
            result += (4.0 / bottom) * (i % 2 == 0 ? 1 : -1);
        }

        System.out.println(result);
    }

}
