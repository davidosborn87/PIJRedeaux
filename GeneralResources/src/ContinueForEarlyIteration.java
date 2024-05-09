public class ContinueForEarlyIteration {

    public static void main(String[] args) {
        int i = 0;
        for (i= 0; i<100; i++){
            if (i%2 == 0){continue;}//complement of break; forces next loop iteration before loop reaches the end
            System.out.println(i);
        }
    }
}
