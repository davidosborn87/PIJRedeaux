//If the user types the input -1, the execution of the code visits the following lines in this order:1
//22, 23, 24, 25, 26, 3, 4, 5, 6, 14, 26, 27, 28.
//Follow the execution of the code in a similar way as the user enters the following inputs:
//a) 1: Order: [1, 22, 23, 24, 25, 26, 3, 4, 5, 6, 7], 10, 11, 17, 18, 19, [14, 26, 27, 28]
//   2: Order: [1, 22, 23, 24, 25, 26, 3, 4, 5, 6, 7], 10, 11, 17, 18, 19, 5, 6, 7, 8, 9, [14, 26, 27, 28]
//b) 3: Order: [1, 22, 23, 24, 25, 26, 3, 4, 5, 6, 7], 10, 11, 17, 18, 19, 5, 6, 7, 8, 9, 5, 6, 7, 10, 11, 17, 18, 19,[14, 26, 27, 28]

public class test {  //line1-->22
    static int compute(int input) {//line 3-->6
        int result = 1;
        for (int i = 0;  // first it prints i = 0; then, for as long as i<input, it loops but doesn't print 0 againLINE 5
             i < input;    //LINE 6
             i = i + 1)  {  // LINE 7  If input is 1, no loop, i is 0
            System.out.print(i);
            System.out.print(result);
            if (i % 2 == 1) {//  LINE 8
                result++; // if i = 1, result is now 3;
            } else {//line 10
                result += helper(i);  //LINE 11 run helper routine on i
            }
        }
        return result; //line 14
    }
    static int helper(int x) {//line 17
        int r = 2*x + 1;
        return r; //LINE 19  r will be 1 on first loop, making result 2;
    }
    public static void main(String[] args) {//line 22 -->26
        System.out.print("Hello! Please enter an int value: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int input = sc.nextInt();
        int result = compute(input); //line 26 -->3
        System.out.println("Result: " + result);
    }
}
