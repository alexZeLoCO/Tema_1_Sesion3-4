
public class CircleWithCentreComp {
	private Point centre;
	private Circle circle;
	
	public CircleWithCentreComp (int x, int y, double r) {
		centre = new Point (x,y);
		circle = new Circle(r);
	}
	
	public double getRadius () {
		return circle.getRadius();
	}
	
	public void setRadius (double r) {
		circle.setRadius(r);
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
	
	public static boolean overlaps (CircleWithCentreComp c, CircleWithCentreComp d) {
		return ((d.getRadius()+c.getRadius())>(Point.distance(c.getCentre(),d.getCentre())));
	}
	@Override
	public String toString() {
		return String.format("Circle With Centre: \n \t Centre: (%d,%d) \n \t Radius: %.3f. \n \t Perimeter: %.3f. \t Area: %.3f.",
											centre.getX(),centre.getY(),		getRadius(),			perimeter(),		area());
	}
	
}
