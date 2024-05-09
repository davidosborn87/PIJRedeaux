//Modify your program from the previous exercise so that it outputs “Yes” when the numbers are consecutive, irregardless
// of whether they go up or down. For example, both “2,3,4,5,6,-1” and “10,9,8,7,-
//1” should now result in “Yes”.

public class Q9_Goingup {
    public static void main(String[] args) {
        System.out.println("Enter a series of numbers and I'll tell you if they are in ascending order (enter -1 to end)");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x = scan.nextInt();
        int y;
        y = x;
        String upjudgement;
        String downjudgement;
        upjudgement = "Yes";
        downjudgement = "Yes";
        boolean end;
        boolean consecutive;
        consecutive = true;
        end = false;
        if (x == -1) {
            end = true;
            System.out.println("What, you didn't wanna try it out?");
        } //if -1 is entered first, program terminates now.
        while (end != true) {
            System.out.println("Enter another number(enter -1 to end)");
            x = scan.nextInt();
            if (x<y && x != -1) {
                upjudgement = "No";
            }
            if (x>y && x != -1) {
                downjudgement = "No";
            }
            y = x;
            if (x == -1) {
                end = true;
                if (upjudgement == "Yes" || downjudgement == "Yes") {
                    System.out.println("Yes");
                } else
                    System.out.println("No");
            }
        }
    }
}