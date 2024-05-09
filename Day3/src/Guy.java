public class Guy {
    public static void main(String[] args) {
        Person employee = new Person();
        employee.name = "John Smith";
        employee.age = 45;
        System.out.println("BOSS: How old are you guy, " + employee.name + "?");
        System.out.println("EMPLOYEE: I am " + employee.age + " years old.");
    }
}