import java.util.Scanner;

public class ComputeBMI {
	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   double weight, height, bmi;
		   final double POUND = 0.45359237;
		   final double INCH = 0.0254;
		  
		   System.out.print("Enter weight in pounds:");
		   weight = s.nextDouble();
		  
		   System.out.print("Enter height in inches:");
		   height = s.nextDouble();
		  
		   weight = weight * POUND; // convert weight from pounds to kilograms
		   height = height * INCH; // covert height from inches to meters
		  
		   bmi = weight/(Math.pow(height, 2));
		  
		   System.out.print("BMI is " + bmi);

}
}

