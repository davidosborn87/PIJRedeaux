package Resources;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {


        int[] sourceArray = {101, 102, 103, 33, 11, 6, 7, 3, 1, 294,6,790 ,77, 999, 104, 105, 106, 1007, 10, 19, 11}; //size is determined by number of elements here
        int startingPositionOfSource =0;
        int[] destinationArray = new int[sourceArray.length];
        int startingIndexOfDest = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            System.arraycopy(sourceArray, startingPositionOfSource, destinationArray, startingIndexOfDest, sourceArray.length);
        }
        Arrays.sort(sourceArray);

        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(destinationArray));
        Arrays.fill(destinationArray,0); //note can fill with anything if array allows it
        System.out.println(Arrays.toString(destinationArray));

        //to declare matrix:
        int[][]matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(Arrays.deepToString(matrix));

    }
}
