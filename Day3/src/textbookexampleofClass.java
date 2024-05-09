public class textbookexampleofClass {

    static class Vehicle {
        public double range;
        int passengers;
        double fuelcapacity;
        double mpg;
        //display range:
        void range (){
            System.out.println("The Range of this vehicle is: " + (fuelcapacity * mpg));
        }
    }


        public static void main(String[] args) {
            Vehicle minivan = new Vehicle();
            Vehicle sportscar = new Vehicle();
            sportscar.fuelcapacity = 10;
            sportscar.passengers = 1;
            sportscar.mpg = 9.3;
            minivan.fuelcapacity = 40;//In general, you can use the dot operator to access both instance variables and methods.
            minivan.passengers = 7;
            minivan.mpg = 33.3;
            System.out.print("Minivan can carry " + minivan.passengers + " people and has a range of ");
            minivan.range();
            sportscar.range();
        }
    }
