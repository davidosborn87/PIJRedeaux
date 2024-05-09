//Write a program similar to the one in the former example, but a bit better. Make the computer ask
//for an option and then execute the corresponding code in a switch . . . case structure. If the user introduces an
// invalid option (e.g., 9 in the example above), make the computer say “That is not a valid
//option, please try again”, and ask again until the user enters a valid numbers. Hint: You will need to
//use a loop and change the default case.
public class exercise1 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Please choose an option:");
        System.out.println("For ’Checking you balance’, please enter 1");
        System.out.println("For ’Purchases’, please enter 2");
        System.out.println("For ’Refunds’, please enter 3");
        System.out.println("For ’Queries about the warranty’, please enter 4");
        System.out.println("For ’Returning faulty goods’, please enter 5");
        System.out.println("For any other query, please enter 0");
        int choice = scan.nextInt();
        while (choice > 5) {
            System.out.println("You have entered an invalid option, gobshite; please enter a number between zero and five");
             choice = scan.nextInt();
        }
            switch (choice) {
                case 1:
                    System.out.println("You're broke, get a job ya bum");
                    break;
                case 2:
                    System.out.println("How do you propose to buy something when you're broke, ya bum?");
                    break;
                case 3:
                    System.out.println("You ain't getting no money, ya bum");
                    break;
                case 4:
                    System.out.println("Be happy with your lot");
                    break;
                case 5:
                    System.out.println("Filthy peasant");
                    break;

                default: //now redundant?
                    System.out.println("Go away");
                    break;
            }
        }

    }
