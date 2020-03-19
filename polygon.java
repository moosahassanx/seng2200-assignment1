public class polygon{
	private point[] pointArray;
	private int pointCounter;
	private int numOfPoints;
	private double pointLowestFromOrigin;

	public polygon(int points) {
		pointArray = new point[points];
		pointCounter = 0;
		numOfPoints = points;
		pointLowestFromOrigin = 0;
	}

	public String toString() {
		String pointLine = "";

		for (int i = 0; i < numOfPoints; i++) {
			pointLine = pointLine + pointArray[i].toString();
		}

		return "[" + pointLine + "]: " + calculateArea();
	}

	public double calculateArea() {
		double area = 0.0;
		int j = numOfPoints - 1;

		for (int i = 0; i < numOfPoints; i++) {
			area = area + ((pointArray[j].getX() + pointArray[i].getX()) * (pointArray[j].getY() - pointArray[i].getY()));
			j = i;
		}

		return Math.abs(area) / 2;
	}

	public void stringInput(String i) {
	}

	public void insertPoint(double xInput, double yInput){
		pointArray[pointCounter] = new point(xInput, yInput);
		testLowestFromOrigin(pointCounter);
		pointCounter++;
	}

	// interface - gives the function names. e.g. function killBlacks() --> on file might stab them in the back, other file might shoot them in the head
	public boolean comesBefore(polygon data){
		double difference = ( Math.abs(this.calculateArea() - data.calculateArea()) )  / 100;
		
		if(difference <= 0.1){
			if(this.pointLowestFromOrigin < data.pointLowestFromOrigin){
				return true;
			}
		}else if(this.calculateArea() < data.calculateArea()){
			return true;
		}else{
			return false;
		}
		return false;
	}

	public void testLowestFromOrigin(int p){
		int q = p - 1;
		if(p == 0){
			setLowestFromOrigin(pointArray[p].distanceFromOrigin());
		}else if(pointArray[p].distanceFromOrigin() < pointArray[q].distanceFromOrigin()){
			double feedLowest = pointArray[p].distanceFromOrigin();
			setLowestFromOrigin(feedLowest);
		}
	}

	public void setLowestFromOrigin(double s){
		pointLowestFromOrigin = s;
	}

	public double getLowestFromOrigin(){
		return pointLowestFromOrigin;
	}
}