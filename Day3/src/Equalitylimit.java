public class Equalitylimit {
    public static void main(String[] args) {
        double d1 = (0.1 + 0.1) / 0.3;
        double d2 = 2.0 * 1000.0 / 9000.0 * 3.0;
        System.out.println(d1);
        System.out.println(d2);
        if (Math.abs(d1-d2)<10E-6) {
            System.out.println("Close enough");
        }
    }
}