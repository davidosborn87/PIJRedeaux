//Write a program which takes an integer as its input, representing the time using the 24-hour clock.
//For example, 930 is 9.30 am; 2345 is 11.45 pm. Midnight is zero. The program responds with a suitable greeting for the time of day (e.g., “Good morning”,
// “Good afternoon”, or “Good evening”). If
//you want to make this a bit harder, make the program respond with a “?” if the time represented by
//the number is impossible, such as 2400, -5 or 1163.
public class Clock {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String x, y, z;
        System.out.println("Enter 24 hour time");
        x = scan.next();
        y = x.substring(0,2);z = x.substring(2,4);
        int h = Integer.parseInt(y);
        int min = Integer.parseInt(z);
        if (h<0 || h>23) {
            System.out.println("What are you on, metric time?");
        }
        if (min<0 || min>59) {
            System.out.println("What are you on, metric time?");
        }
        else if (h<5) {
            System.out.println("Your're up late!");
        }
        else if (h<12) {
            System.out.println("Good morning!");
        }
        else if (h<17) {
            System.out.println("Good afternoon!");
        }
        else {
            System.out.println("Good Evening!");
        }
            System.out.println(h);
        System.out.println(min);
    }
}
