public class buddy {
    public static void main(String[] args) {
        Person john = new Person();
        john.name = "John Smith";
        john.age = 45;
        Person mary = new Person();
        mary.name = "Mary Poppins";
        mary.age = 29;
        Person child = new Person();
        child.name = "Sherry Bobbins";
        child.age = 5;
        child.ma = mary;
        child.da = john;
        Person grandmary = new Person();
        grandmary.age= 77;
        grandmary.name = "grandmary";
        mary.ma = grandmary;
        System.out.println("BOSS: How old are you buddy, " + john.name + "?");
        System.out.println("EMPLOYEE: I am " + john.age + " and I'm not your buddy, guy.");
        System.out.println("TEACHER: How old are you, " + child.name + "?");
        System.out.println("Sherry: I am " + child.age + " years old, sir.");
        System.out.println("TEACHER: Who are your parents?");
        System.out.println("Sherry: " + child.ma.name + " and " + child.da.name + ", sir.");
        System.out.println("TEACHER: What is the age gap between them?");
        System.out.println("Ma is " + (Math.abs(child.ma.age - john.age)) + " years younger than da");
        System.out.println("TEACHER: Who are your grandparents?");
        System.out.println("Sherry: " + child.ma.ma.name);
    }
}
