//Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point,
//print “Yes” if the numbers were consecutive and increasing and “No” otherwise. For example, the
//sequences “1,2,3,4,-1” and “5,6,7,8,9,10,11,-1” should lead to the output “Yes”, but “2,3,5,6,7,-1”,
//“10,9,8,7,-1”, and “1,1,2,3,4,5,-1” should lead to the output ”No”

public class numbercounter {
    public static void main(String[] args) {
        System.out.println("Enter a series of numbers and I'll tell you if they are in ascending order (enter -1 to end)");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x = scan.nextInt();
        int y;
        y = x;
        String judgement;
        judgement = "Yes";
        boolean end;
        end = false;
        if (x == -1) {
            end = true;
            System.out.println("What, you didn't wanna try it out?");
        } //if -1 is entered first, program terminates now.
        while (end != true) {
            System.out.println("Enter another number(enter -1 to end)");
            x = scan.nextInt();
            if (x<y && x != -1) {
                judgement = "No";
            }
            y = x;
            if (x == -1) {
                end = true;
                System.out.println("In ascending order: " + judgement);
            }
        }
    }
}