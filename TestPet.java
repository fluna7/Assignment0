import java.awt.Component;
import java.awt.Dialog;
import java.util.Scanner;

public class TestPet {
	public static void main(String[] args)
    {
        Scanner in = new Scanner( System.in );

        
        Dialog s1 = new Dialog(s1, "Balto");

        
        System.out.print("Enter the dog's age: "); 
        double grade = in.nextDouble();             
        Object years;
		s1.add( (Component) years );                     

        //get the dogs weight
        System.out.print("Enter the dog's weight: "); 
        ((Object) s1).addWeight( in.nextDouble() );                

        //output their data
        System.out.println( ((Object) s1).getData() );

    }
}


