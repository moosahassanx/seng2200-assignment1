// TITLE, COURSE, AUTHOR, STUDENT NUMBER, DATE, DESCRIPTION IS NEEDED

import java.lang.Math ;

public class point{
	private double xCoord, yCoord, distance;
	
	// constructor
	public point(double x, double y) {
		// setting x and y coordinates
		xCoord = x;
		yCoord = y;
		// initiating distance variable
		distance = 0.0;
	}
	
	// method to calculate distance from point coordinates to (0, 0)
	public double distanceFromOrigin() {
		// pythagora's theorem
		distance = Math.sqrt(Math.pow(Math.abs(xCoord), 2) + Math.pow(Math.abs(yCoord), 2));
		
		return distance;
	}

	// return point as a string
	public String toString() {
		return String.format("(%4.2f, %4.2f)", xCoord, yCoord);
	}

	// accessor method
	public double getX(){
		return xCoord;
	}

	// accessor method
	public double getY(){
		return yCoord;
	}
}