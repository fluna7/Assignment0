import java.util.Random;

public class coin 
{
	private String sideUp;
	
	public void toss() {
		Random random = new Random();
		int randomNumber;
		
		randomNumber = random.nextInt( 2 );
		if( randomNumber == 1) {
			sideUp = "Tails";
		} else {
			sideUp = "Heads";
		}
	}
	
	public String getSideUp(){
		return sideUp;
		
	}
	
	public coin() {
		toss();
		
	}
}


