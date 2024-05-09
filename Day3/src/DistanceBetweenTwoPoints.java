//Write a program that reads the X and Y coordinates of three DoublePoints and then outputs which two of
  //      the three are closest to each other
//

public class DistanceBetweenTwoPoints {


    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        DoublePoint alpha = new DoublePoint();
        alpha.x = 1.5;
        alpha.y = 11.2;
        DoublePoint beta = new DoublePoint();
        beta.x = 7;
        beta.y = 17;
        DoublePoint gamma = new DoublePoint();
        gamma.x = 0.1;
        gamma.y = 44.0;
        System.out.println(alpha.y);
        System.out.println (alpha.x);
        System.out.println(beta.y);
        System.out.println (beta.x);
        System.out.println(gamma.y);
        System.out.println (gamma.x);
        distanceBetweenTwoPoints(alpha, beta, gamma); //insert actual parameters into formal parameters
    }

   static DoublePoint distanceBetweenTwoPoints (DoublePoint alpha, DoublePoint beta, DoublePoint gamma) {
   double DistanceBetweenAlphaAndBeta = Math.sqrt(((alpha.x -beta.x) * (alpha.x - beta.x)) + ((alpha.y - beta.y) * (alpha.y - beta.y)));
   double DistanceBetweenAlphaAndGamma = Math.sqrt(((alpha.x -gamma.x) * (alpha.x - gamma.x)) + ((alpha.y - gamma.y) * (alpha.y - gamma.y)));
   double DistanceBetweenBetaAndGamma = Math.sqrt(((beta.x -gamma.x) * (beta.x - gamma.x)) + ((beta.y - gamma.y) * (beta.y - gamma.y)));
   double d1 = DistanceBetweenAlphaAndBeta;
   double d2 = DistanceBetweenAlphaAndGamma;
   double d3 = DistanceBetweenBetaAndGamma;
   System.out.println("DistanceBetweenAlphaAndBeta is " + d1);
   System.out.println("DistanceBetweenAlphaAndGamma is " + d2);
   System.out.println("DistanceBetweenBetaAndGamma is " + d3);
   if (d1<d2 && d1<d3) {//if alpha and beta are closest
       System.out.println("The closest two DoublePoints are Alpha and Beta");
   }
   if (d2<d1 && d2<d3) {//if alpha and gamma are closest
           System.out.println("The closest two DoublePoints are Alpha and Gamma");
       }
   if (d3<d2 && d3<d1) {//if beta and gamma are closest
       System.out.println("The closest two DoublePoints are Gamma and Beta");
   }
       return null;
   }
}
class DoublePoint {
    double x;
    double y;

    class Rectangle {
        DoublePoint upLeft;
        DoublePoint downRight;

    }

}
