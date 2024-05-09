public class ConstructorRectangle {
    int length;
    int width;

    ConstructorRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    ConstructorRectangle(int length) {
        this(length, length);
    }

    public static void main(String[] args) {
        ConstructorRectangle dominoConstructorRectangle = new ConstructorRectangle(1, 2);
        ConstructorRectangle pythagoreanConstructorRectangle = new ConstructorRectangle(3, 4);
        ConstructorRectangle goldenConstructorRectangle = new ConstructorRectangle(1618, 1000);
        ConstructorRectangle square = new ConstructorRectangle(5);

        System.out.println(dominoConstructorRectangle.length + "x" + dominoConstructorRectangle.width);
        System.out.println(pythagoreanConstructorRectangle.length + "x" + pythagoreanConstructorRectangle.width);
        System.out.println(goldenConstructorRectangle.length + "x" + goldenConstructorRectangle.width);
        System.out.println(square.length + "x" + square.length);

    }
}