public class MoreEnum {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("For more information about the options on a given day, enter the day of the week");
        String box;
        Days[] dayOfWeek;  //dayOfWeek is now variable/box of type Days
        dayOfWeek = Days.values();
        for (Days d : dayOfWeek)
         System.out.println(d);
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