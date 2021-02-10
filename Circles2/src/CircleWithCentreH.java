
public class CircleWithCentreH extends Circle{
	
	private Point centre;
	
	public CircleWithCentreH(int x, int y, double r) {
		super(r);
		centre=new Point (x,y);
	}
	
	public double getRadius () {
		return super.getRadius();
	}
	
	public void setRadius (double r) {
		super.setRadius(r);
	}
	
	public Point getCentre () {
		return centre;
	}
	public void setCentre (int x, int y) {
		centre.setX(x);
		centre.setY(y);
	}
	
	public void setCentre (Point c) {
		setCentre(c.getX(),c.getY());
	}
	
	public double perimeter () {
		return 2*Math.PI*getRadius();
	}
	
	public double area () {
		return Math.PI*Math.pow(getRadius(), 2);
	}
	
	public static boolean overlaps (CircleWithCentreH c, CircleWithCentreH d) {
		return ((d.getRadius()+c.getRadius())>(Point.distance(c.getCentre(),d.getCentre())));
	}
	@Override
	public String toString() {
		return String.format("Circle With Centre: \n \t Centre: (%d,%d) \n \t Radius: %.3f. \n \t Perimeter: %.3f. \t Area: %.3f.",
											centre.getX(),centre.getY(),		getRadius(),			perimeter(),		area());
	}
	
}
