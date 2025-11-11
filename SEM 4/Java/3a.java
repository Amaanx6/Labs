3.a) Write a Java program to demonstrate the Interfaces & Abstract Classes.
package q18023;
// import required classes
// Define interface Calculator { }
import java.util.*;
interface Calculator
	{
	double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
	}
class BasicCalculator implements Calculator {
    // Define required methods
	public double add(double a,double b)
	{
		return a+b;
	}
	public double subtract(double a, double b)
	{
		return a-b;
	}
   public double multiply(double a, double b)
	{
		return a*b;
	}
   public double divide(double a, double b){
		return a/b;
	}
}
public class Calc {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double result1 = calculator.add(a, b);
        double result2 = calculator.subtract(a, b);
        double result3 = calculator.multiply(a, b);
        double result4 = calculator.divide(a, b);

        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + result4);
   
        
    }
}

Abastractclass implements

package q11286;
abstract class CalcArea {
    abstract double triangleArea(double b, double h);
    abstract double rectangleArea(double l, double b);
    abstract double squareArea(double s);
    abstract double circleArea(double r);
}

class FindArea extends CalcArea {
    @Override
    double triangleArea(double b, double h) {
		return 0.5 * b * h;
    }

    @Override
    double rectangleArea(double l, double b) {
        return l * b;
    }

    @Override
    double squareArea(double s) {
        return s * s;
    }

    @Override
    double circleArea(double r) {
        return 3.14 * r * r;
    }
}
public class Area {
	public static void main(String args[]) {
		if (args.length < 2) {
            System.out.println("Please provide two arguments.");
            return;
        }
			double arg1 = Double.parseDouble(args[0]);
            double arg2 = Double.parseDouble(args[1]);
		FindArea area = new FindArea();
			
		System.out.println("Area of triangle : "+area.triangleArea(arg1, arg2));
            System.out.println("Area of rectangle : "+ area.rectangleArea(arg1, arg2));
            System.out.println("Area of square : "+area.squareArea(arg1));
            System.out.println("Area of circle : "+area.circleArea(arg2));
	}
}
// Write all the classes with definitions
