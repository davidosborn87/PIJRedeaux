//Write a program that reads a (arbitrarily long) sequence of positive numbers. The sequence is ended
//when the users enters “-1”. At that point, the program must output the highest number in the sequence

public class Mamimising {
    public static void main(String[] args) {
        System.out.println("Enter a series of numbers and I'll tell you which was the biggest (enter -1 to end)");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x = scan.nextInt();
        int y;
        y = x;
        boolean end;
        end = false;
        if (x == -1) {
            end = true;
            System.out.println("What, you didn't wanna try it out?");
        } //if -1 is entered first, program terminates now.
        while (end != true) {
            System.out.println("Enter another number(enter -1 to end)");
            x = scan.nextInt();
            if (x>y) {
                y = x;
            }
            if (x == -1) {
                end = true;
                System.out.println("Okay, ending program; the largest number was " + y);
            }
        }
    }
}