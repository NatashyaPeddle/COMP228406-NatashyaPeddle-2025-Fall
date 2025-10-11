package exercise3;

public class Overloading {

    public static void main(String[] args) {
        ///CALL METHODS HERE
        System.out.println(Overloading.method(-1,2));
        System.out.println(Overloading.method(1,2,3));
        System.out.println(Overloading.method(0.01,0.02));
    }
/// Write a Java class that implements a set of three overloaded static methods. The methods should have different set of parameters and perform similar functionalities. Call the methods within main method and display the results.

    public static int method(int a, int b){

        return a+b;
    }

    public static int method(int a, int b, int c){

        return a+b+c;
    }

    public static double method(double a, double b){

        return a+b;
    }

}///CLASS END BRACKET - DO NOT TOUCH
