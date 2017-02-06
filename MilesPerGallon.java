import javax.swing.JOptionPane;

public class MilesPerGallon {
	public static void main(String [] args)
 	{
 		String input1;
 		String input2;
 		double milesDriven;
 		double gallonsUsed;
 		double milesPerGallon;
 		
 		input1 = JOptionPane.showInputDialog("How many miles did you drive?");
 		input2 = JOptionPane.showInputDialog("How many gallons of gas did you use?");
 		
 		milesDriven = Double.parseDouble(input1);
 		gallonsUsed = Double.parseDouble(input2);
 		milesPerGallon = milesDriven/gallonsUsed;
 		
 		JOptionPane.showMessageDialog(null, "Your miles per gallon is: " + milesPerGallon );
 		
 	}

}
