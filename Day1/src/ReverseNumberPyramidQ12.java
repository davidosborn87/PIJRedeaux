public class ReverseNumberPyramidQ12 {
    public static void main(String[] args) {
        System.out.println("Behold the pyramid of numbers! Enter a number for a pyramid of n size");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int i = 0;
        int x = 0;
        int n = scan.nextInt();
        String y = " ";
        //int n = scan.nextInt();  TRY A FOR LOOP I>0; i--
        for (i = 1; i < n + 1; i++) {
            for (int j = n; j > 0; j--) {
                if (j>i) {
                    System.out.print(" ");
                    if (j>9) {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(i);
                }
            } System.out.println();
            }
        }
    }