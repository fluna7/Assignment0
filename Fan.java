public class Fan {
	public boolean on$off;
	public String radius;
	public String color;

	
	class Fan1 {
	    private int speed = 1;
	    private boolean on$off = false;
	    private double radius = 5;
	    private String color = "Blue";
	 
	    public static final int SLOW = 1;
	    public static final int MEDIUM = 2;
	    public static final int FAST = 3;
	 
	 
	    Fan1() {
	        this.speed = speed;
	        this.on$off = on$off;
	        this.radius = radius;
	        this.color = color;
	    }
	 
	    void setspeed(int s) {
	        speed = s;
	    }
	 
	    void seton$off(boolean open) {
	        on$off = open;
	    }
	 
	    void setradius(double r) {
	        radius = r;
	    }
	 
	    void setcolor(String c) {
	        color = c;
	    }
	 
	    int getspeed() {
	        return speed;
	    }
	 
	    boolean ison$off() {
	        return on$off;
	    }
	 
	    double getradius() {
	        return radius;
	    }
	 
	    String getcolor() {
	        return color;
	    }
	 
	    class Fan2 {
	        int speed = 1;
	        boolean on$off = false;
	        double radius = 5;
	        String color = "Blue";
	 
	        Fan2() {
	            this.speed = speed;
	            this.on$off = on$off;
	            this.radius = radius;
	            this.color = color;
	        }
	 
	        void setspeed(int s) {
	            speed = s;
	        }
	 
	        void seton$off(boolean open) {
	            on$off = open;
	        }
	     
	        void setradius(double r) {
	            radius = r;
	        }
	     
	        void setcolor(String c) {
	            color = c;
	        }
	 
	        int getspeed() {
	            return speed;
	        }
	 
	        boolean ison$off() {
	            return on$off;
	        }
	 
	        double getradius() {
	            return radius;
	        }
	 
	        String getcolor() {
	            return color;
	        }
	    }
	}

	public void seton$off(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public String getspeed() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setspeed(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setcolor(String string) {
		// TODO Auto-generated method stub
		
	}

}
