public class TestingEnum {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Please choose an option:");
        System.out.println("For more information about the options on a given day, enter the day of the week");
        Days dayOfWeek;
        dayOfWeek = Days.valueOf(scan.nextLine());
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("The Club");
                break;
                case TUESDAY:
                   System.out.println("Recover from The Club");
                     break;
               case WEDNESDAY:
                   System.out.println("BAGG");
                   break;
                case THURSDAY:
                    System.out.println("Watch Paint Dry");
                    break;
                case FRIDAY:
                    System.out.println("CATS");
                    break;
                case SATURDAY:
                     System.out.println("SL");
                      break;
                 case SUNDAY:
                System.out.println("Prepare for Monday");
                break;
                default:
                    break;
        }
        System.out.println("end");
    }

    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}
