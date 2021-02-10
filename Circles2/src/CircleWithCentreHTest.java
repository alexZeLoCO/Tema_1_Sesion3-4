
public class CircleWithCentreHTest {

	public static void main(String[] args) {
		CircleWithCentreH c = new CircleWithCentreH(0,0,5);
		CircleWithCentreH d = new CircleWithCentreH(10,3,2);

		System.out.println(c.toString());
		System.out.println(d.toString());
		
		System.out.println("Circles overlap: " + CircleWithCentreH.overlaps(c, d));
	}

}
