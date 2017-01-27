import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
	
	
	public static void main(String args[]) {
		// define variables
		int radius = 0;
		double area = 0;
		double perimeter = 0;
		int diameter = 0;
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat f = new DecimalFormat();
		f.setMaximumFractionDigits(2);
		
		// ask user for radius
		System.out.println("Enter a radius");
		
		radius = input.nextInt();
		
		area = Math.PI * Math.pow(radius,  2);
		perimeter = 2 * Math.PI * radius;
		diameter = 2 * radius;
		
		System.out.println("Diameter is :" +diameter+"\n perimeter is: "+f.format(perimeter)+"\nArea is:"+f.format(area));
		
		
		
	}

	}
