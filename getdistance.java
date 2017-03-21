
public class getdistance<Punkt, Distance> {
	public class Getdistace<p2> {
	    Getdistace p1, p2;
	    void Getdistance (Punkt punkt1, Punkt punkt2) {
	        this.p1 = (getdistance<Punkt>.Getdistnace) punkt1;
	        this.p2 = (getdistance<Punkt>.Getdistnace) punkt2;
	    }
	    public Distance distance () {
	        return new Distance ((((distance) p1).getX()+p2.getX())/2, (p1.getY()+((distance) p2).getY())/2);
	    }
	    public double abstand() {
	        return Math.sqrt(
	            (((Object) p1).getX() - ((Object) p2).getX()) *  (((Object) p1).getX() - ((distance) p2).getX()) + 
	            (p1.getY() - p2.getY()) *  (p1.getY() - p2.getY())
	        );
	    }
	    public void main (String args[]) {
	        Getdistance s = new Getdistance (new Distance(2.0, 2.0), new distance());
	        Distance mp = s.mittelDistance();
	        System.out.println ("Midpoint = (" + ((distance) mp).getX() + "," + ((distance) mp).getY() + ")");
	        double as = s.abstand();
	        System.out.println ("Length   = " + as);
	    }
	}

}
