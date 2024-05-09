package Resources;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
//Lambda expressions provide a way to implement the abstract method of a functional interface concisely.

//lambda: (parameters) -> { statements }
//        (rock, paper) -> paper...but many possibilities
public class Lambda {
        public static void main(String[] args) {
            FunctionalInterfaceExample example = () -> System.out.println("Testing Lambda"); //this is what it does
            example.thisIsTheOnlyAbstractMethod();  //have to call it from interface
            System.out.println(beats().apply("rock", "paper"));//call method beats with two strings
        }
        public static BinaryOperator<String> beats(){//note empty inputs; lambda will cast them. BinaryOperator is a functional interface with one method.
            return (input1, input2) -> { // start with return! paramaters to be passed go in brackets, what to do with them go in braces.
                if (input1.equals(input2)) {
                    return "draw";
                } else {
                    return "woah";
                }
            };
        }


    }


