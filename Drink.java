
public class Drink {
	public static void main(String[] args) 
	{
		System.out.println("Welcome!");
		System.out.println("This program calculates the number of participants");
		System.out.println("1.who drink one for more energy drinks per week");
		System.out.println("2.who prefer citrius-flavored energy drinks");
		System.out.println();
		
		int totalParticipants= 12467; 
		int energyDrinks, citrusEnergyDrinks;
		
		
		energyDrinks = (int)(.14*totalParticipants);
		citrusEnergyDrinks = (int)( .64* energyDrinks);
		
		
		
		System.out.println();
		System.out.println("The number of who purchases one or more energy drinks pre week is " +energyDrinks);
		System.out.println("The number who prefer citrus-flavored drinks is "+ citrusEnergyDrinks);
			
	}
	
	

}
