

public class TestCoin {
	public static void main( String [] args) {
		
		coin penny = new coin();
		int numberOfHeads = 0;
		int numberOfTails = 0;
		int numberOfTosses = 20;
		System.out.println("Side intially facing up " +penny.getSideUp());
		
		for ( int currentToss = 1; currentToss <= numberOfTosses; currentToss++ ) {
			penny.toss();
			if ( penny.getSideUp() == "heads" ) {
				numberOfHeads += 1;
			} else {
				numberOfTails = numberOfTails + 1;
				
			}
			System.out.println("Toss" + currentToss +": " + penny.getSideUp());
			
		}
		System.out.println("out of " + numberOfTosses + "tosses, there were" + numberOfHeads + "heads and" + numberOfTails + "tails." );
	}
	
}
