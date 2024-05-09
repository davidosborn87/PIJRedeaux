import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("press a key followed by enter");
        char input = (char) System.in.read();
        System.out.println(input);
    }
}