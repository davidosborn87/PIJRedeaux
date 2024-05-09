public class Prime10000 {
    public static void main(String[] args) {
            getFirst1000Primes();
        }

    public static void getFirst1000Primes() {
        int count = 0;
        int i = 0;
        while (count <7) {
            if (isPrime(++i)) {
                count++;
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int potentialPrime) {
        if (potentialPrime < 1) {
            return false;
        }
        // skip 1
        for (int i = 2; i < potentialPrime; i++) {
            if (potentialPrime % i == 0) {
                return false;
            }
        }
        return true;
    }
}

