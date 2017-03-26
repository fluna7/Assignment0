

public class FanTest {

	
		 
	    public void main(String args[]) {
	 
	        Fan fan = new Fan();
	        fan.seton$off(true);
	        fan.setcolor("yellow");
	        fan.setspeed(3);
	 
	        FanTest ft = new FanTest();
	        System.out.println(ft.toString());
	    }
	 
	    public String toString(){
	        Fan fan = new Fan();
	        String printme = null;
	 
	        if(fan.on$off == true){
	            printme = ("Speed: " + fan.getspeed() + " Color: " + fan.color + " Radius: " + fan.radius);
	        }
	        if(fan.on$off == false){
	            printme = ("Color: " + fan.color + " Radius: " + fan.radius + " Fan is off!!");
	        }
	        return(printme);
	    }
	}
	 

