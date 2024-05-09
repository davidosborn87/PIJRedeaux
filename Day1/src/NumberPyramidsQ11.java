public class NumberPyramidsQ11 {
    public static void main(String[] args) {
        System.out.println("Behold the pyramid of numbers! Enter a number for a pyramid of n size");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int i = 0;
        int x = 0;
        int n = scan.nextInt();
        for (i = 1; i < n +1; i++) {
            if (x>0) {
                System.out.println(x);
            }
                for (x = 1; x < i; x++) {
                    System.out.print(i);
                }
            }
        System.out.print(i-1);
        }
    }


//DONE!