public class Characterschar {
    public static void main(String[] args) {
    char firstChar = 'j';
    char secondChar = 'i';
    char thirdChar = 'm';
    String jimName = "" + firstChar + secondChar + thirdChar;
    System.out.println("Name: " + jimName);
    System.out.println("Letters: " + firstChar + "," + secondChar + "," + thirdChar);
    int firstChar2 = firstChar -2;
    char firstCharRedux = (char) firstChar2;
    System.out.println(firstCharRedux);

    }
}
