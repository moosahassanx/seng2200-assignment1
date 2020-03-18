public class polygon{
	private String polygonStatement;
	private String feedString;
	private point[] pointArray;
	private int pointCounter;
	private int numOfPoints;

	public polygon(int points){
		polygonStatement = "";
		feedString = "";
		pointArray = new point[points];
		pointCounter = 0;
		numOfPoints = points;
	}
	
	public String toString(){
		String pointLine = "";

		for(int i = 0; i < numOfPoints; i++){
			pointLine = pointLine + pointArray[i].toString();
		}

		return polygonStatement = "[" + pointLine + "]: " + calculateArea();
	}

	public double calculateArea(){
		double area = 0.0;
		int j = numOfPoints - 1;

		for(int i = 0; i < numOfPoints; i++){
			area += (   (pointArray[j].getX() + pointArray[i].getX()) * (pointArray[j].getY() + pointArray[i].getY())   );
			j = i;
		}

		return Math.abs(area) / 2;
	}

	public void stringInput(String i){
		feedString = i;
	}

	public void distanceFromOrigin(){
		// need to write method
	}

	//@Override // this is implementing the file comparePoly method from comparePoly.java --> CONSULT EGG
	public boolean comparePoly(polygon o){
		return true;
		// need to finish method
	}

	public void insertPoint(double xInput, double yInput){
		pointArray[pointCounter] = new point(xInput, yInput);
		pointCounter++;
	}
}