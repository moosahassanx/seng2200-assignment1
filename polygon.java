public class polygon{
	// variables and objects
	private final point[] pointArray;
	private int pointCounter;
	private final int numOfPoints;
	private double pointLowestFromOrigin;

	// constructor
	public polygon(final int points) {
		// instantiating variables and objects
		pointArray = new point[points];
		pointCounter = 0;
		numOfPoints = points;
		pointLowestFromOrigin = 0;
	}

	// return point as a string
	public String toString() {
		// declare and instantiate string
		String pointLine = "";

		// loop to include all points inputted
		for (int i = 0; i < numOfPoints; i++) {
			pointLine = pointLine + pointArray[i].toString();
		}

		// final form
		return "[" + pointLine + "]: " + String.format("%6.2f", calculateArea());
	}

	// calculate area of polygon using points given
	public double calculateArea() {
		// declare and instantiate variables within method
		double area = 0.0;
		int j = numOfPoints - 1;

		// formula given by assignment converted into code (except halving)
		for (int i = 0; i < numOfPoints; i++) {
			area = area
					+ ((pointArray[j].getX() + pointArray[i].getX()) * (pointArray[j].getY() - pointArray[i].getY()));
			j = i;
		}

		// halve the calculation and return
		return Math.abs(area) / 2;
	}

	// add point to the polygon
	public void insertPoint(final double xInput, final double yInput) {
		// adding array of point as a new point
		pointArray[pointCounter] = new point(xInput, yInput);
		// test if new point is closer than previous point
		testLowestFromOrigin(pointCounter);
		// iterate number of points
		pointCounter++;
	}

	// interface - gives the function names. e.g. function killBlacks() --> on file
	// might stab them in the back, other file might shoot them in the head
	public boolean comesBefore(final polygon data) {
		// formula for difference of areas as a percentage
		final double difference = (Math.abs(this.calculateArea() - data.calculateArea()));

		if (difference <= 0.001) { // 0.1% or less difference
			if (this.pointLowestFromOrigin < data.pointLowestFromOrigin) {
				return true;
			}
			return false;
		} else if (this.calculateArea() < data.calculateArea()) { // area of old polygon is less than new polygon area
			return true;
		} else {
			return false;
		}
	}

	// take point closest to origin and set as lowest distance of the polygon
	public void testLowestFromOrigin(final int p) {
		// declaring and instantiating variable
		final int q = p - 1;

		if (p == 0) { // no existing points means the first point will be set as point closest to
						// origin of polygon
			setLowestFromOrigin(pointArray[p].distanceFromOrigin());
		} else if (pointArray[p].distanceFromOrigin() < pointArray[q].distanceFromOrigin()) { // comparing new point to
																								// previous point and
																								// set as point closest
																								// to origin of polygon
			setLowestFromOrigin(pointArray[p].distanceFromOrigin());
		}
	}

	// mutator method
	public void setLowestFromOrigin(final double s) {
		pointLowestFromOrigin = s;
	}

	// accessor method
	public double getLowestFromOrigin(){
		return pointLowestFromOrigin;
	}
}