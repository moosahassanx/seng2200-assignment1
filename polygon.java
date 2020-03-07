public class polygon{
	private String polygonStatement;
	private double area;

	public polygon(){

		point pointObject1 = new point(3, 4);
		point pointObject2 = new point(-2, 1);
		point pointObject3 = new point(32, 2);
		point pointObject4 = new point(3, 2);
		point pointObject5 = new point(34, 90);
		point pointObject6 = new point(-23, 44);
 
		// System.out.print(pointObject1.toString());
		System.out.print(pointObject2.toString());
		System.out.print(pointObject3.toString());
		System.out.print(pointObject4.toString());
		System.out.print(pointObject5.toString());
		System.out.print(pointObject6.toString());
		System.out.println();

		System.out.println(pointObject1.distanceFromOrigin());
	}

	
	public String toString(){
		return polygonStatement = "[" + "NEED TO ADD pointObject.toString() here" + "]: " + calculateArea();
	}
	

	public double calculateArea(){
		return area = 22222222;
	}

	public void distanceFromOrigin(){
		// need to write method
	}

	//@Override // this is implementing the file comparePoly method from comparePoly.java --> CONSULT EGG
	public boolean comparePoly(polygon o){
		return true;
		// need to finish method
	}
}

/* 2.3 Polygon Class
Design and write a Polygon class which contains a sequence of Point objects representing the
ordered vertices of the polygon. Your Polygon class should contain a toString( )
method which will allow the conversion of a Polygon object into a String of the form

							[point0point1…pointn-2]: area

For the area values, the format to be used is 6.2f. This will be used for output of your results.
The Polygon class has a method that will calculate the area of the polygon, given by the
formula in Section 3.

You will also need a method to return the distance from the origin of the pointi vertex
which is closest to the origin. Polygon will implement a ComparePoly interface as per the
above, and the Polygon comparison specification given below.

For any two polygons, if their area difference is within 0.1% of the smaller polygon, then
they are assumed to have equal area. In these cases of equal areas, the polygon with the
lower minimum vertex distance from the origin, takes precedence (comes first in your list –
Section 2.4). 
*/