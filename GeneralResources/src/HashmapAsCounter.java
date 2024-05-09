package Resources;

//Day 9 for more

import java.util.HashMap;
public class HashmapAsCounter {
    
       public static void createHashMap(int[] arrayToTally) {
            HashMap<Integer, Integer> hashmapCounter = new HashMap<Integer, Integer>();

            for (int j : arrayToTally) {
               Integer c = hashmapCounter.get(j);
               if (hashmapCounter.get(j) == null) {
                   hashmapCounter.put(j, 1);//this will "hang" an element of the array on the map and link it to the number 1, which is the count of that number.
               }
               else {
                   hashmapCounter.put(j, ++c);
               }
           }
            System.out.println(hashmapCounter);
        }
        public static void main(String[] args)
        {
            int[] arrayToTally = { 22,5,7,1,4,5,6,7,8,9,0,0,0,4,1,4,5,33,44,32 };
            createHashMap(arrayToTally);
        }
    }
