import java.util.Arrays;

public class Repeats {

    public static void main(String[] args) {

       int[] A = new int[]{1, 6, 5, 8, 4, 3, 7, 7, 2};

       int [] B = new int[9];

       boolean bool = false;

       while (!bool) {
           for (int i = 0; i < A.length; i++) {
               B[i] = 0; //initialises B as all zeros
               for (int j = 0; j < A.length; j++) {
                   B[A[j]] = B[A[j]] + 1; //B is all 0s; A[j] is the value of the jth index. B[A[j]] is that value's B index. So if A[j] is 3, B[A[j]] refers to the value in B's 3rd entry.
                   for (int k = 0; k < A.length; k++) {
                       if (B[k] > 1) {
                           bool = true;
                           break;
                       } 
                   }
               }
               System.out.println(Arrays.toString(B));
           }
       }
       System.out.println(Arrays.toString(B));
    }


    //procedure repeated(A: integer array of length n with -1 < A[i] < n)
    //for i := 0 to n - 1
    //B[i] := 0
    //for j := 0 to n - 1
    //B[A[j]] := B[A[j]] + 1
    //for k := 0 to n - 1
    //if B[k] > 1 then return 1
    //return 0
}
