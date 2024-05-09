public class PrimePrinter {
    public static void main(String[] args) {
        int isThisAPrime = 2;
        int counter =0;

            for (int i = 0; i < 1001; i++) {
                primeCounter(isThisAPrime);
                isThisAPrime++;
            }
        }




    public static int primeCounter(int isThisAPrime) {
        int counter = isThisAPrime;
        int n = 2;
        while (isThisAPrime % n != 0) {
            n = n + 1;
        }
        if (n == isThisAPrime) {
            System.out.println(isThisAPrime + " is a prime number");
            System.out.println("Counter: " + counter);
        } return isThisAPrime;
    }
}
