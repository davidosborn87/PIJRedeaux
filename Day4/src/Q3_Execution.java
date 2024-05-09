//If the user types the input -1, the execution of the code visits the following lines in this order:1
//22, 23, 24, 25, 26, 3, 4, 5, 6, 14, 26, 27, 28.
//Follow the execution of the code in a similar way as the user enters the following inputs:
//a) 1: Order: [1, 22, 23, 24, 25, 26, 3, 4, 5, 6, 7], 10, 11, 17, 18, 19, [14, 26, 27, 28]
//   2: Order: [1, 22, 23, 24, 25, 26, 3, 4, 5, 6, 7], 10, 11, 17, 18, 19, 5, 6, 7, 8, 9, [14, 26, 27, 28]
//b) 3: Order: [1, 22, 23, 24, 25, 26, 3, 4, 5, 6, 7], 10, 11, 17, 18, 19, 5, 6, 7, 8, 9, 5, 6, 7, 10, 11, 17, 18, 19,[14, 26, 27, 28]
public class Q3_Execution {  //line1-->22
        static int compute(int input) {//line 3-->6
            int result = 1;
            for (int i = 0;  //brings i up to the input value?
                   i < input; //line 6-->14 (If input is less than 2, output is result (1))
            i++) { // LINE 7
                if (i % 2 == 1) {//this line fires if input is >0  LINE 8
                    result++; //result = result + 1     line 9  result ==2 i ==1
                    } else {//line 10
                    result += helper(i);  //LINE 11 run helper routine on i
                    }
                }
            return result; //line 14
            }
        static int helper(int x) {//line 17
            int r = 2*x + 1;
            return r; //r is 3
            }
        public static void main(String[] args) {//line 22 -->26
            System.out.print("Hello! Please enter an int value: ");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            int input = sc.nextInt();
            int result = compute(input); //line 26 -->3
            System.out.println("Result: " + result);
            }
}
