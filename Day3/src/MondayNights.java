public class MondayNights {
        public static void main(String[] args) {
            java.util.Scanner scan = new java.util.Scanner(System.in);
            System.out.println("For more information about the options on a given day, enter the day of the week");
            String box;
            Days dayOfWeek;  //dayOfWeek is now variable/box of type Days
            dayOfWeek = Days.valueOf(scan.nextLine());
            switch (dayOfWeek) {
                case MONDAY:
                    System.out.println("DG");
                    break;
                case TUESDAY:
                    System.out.println("Recover from DG");
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
            System.out.println();
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


