public class BodylessLoops {
    public static void main(String[] args) {
        int sum = 0;
        for (int i =0; i<10; sum += i++){}

        System.out.println(sum);
    }
}


//“Add to sum the value of sum plus i, then increment i.” Thus, it is the same as this sequence of statements:
// sum = sum + i
// i = i + 1