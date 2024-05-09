public class BreakLabelExample {

    public static void main(String[] args) {
        int i;
        for (i = 1; i < 4; i++) {
            one: //these are labels
            { //breaks this when i == 1 is reached
                two: //these are labels
                {//breaks this when i == 2 is reached
                    three: //these are labels
                    {//breaks this when i == 3 is reached
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        System.out.println("This line is never reached");
                    }//breaks this when i == 3 is reached
                    System.out.println("After block three");
                } //breaks this when i == 2 is reached
                System.out.println("After block two");
            } //breaks this when i == 1 is reached
            System.out.println("After block one");
        }
        System.out.println();
        System.out.println("This is after the for loop");
    }
}


