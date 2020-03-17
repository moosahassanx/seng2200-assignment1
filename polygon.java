public class polygon{
	private String polygonStatement;
	private double area;
	private int numOfPoints;
	private String feedString;

	public polygon(){
		System.out.println("polygon string input test: " + feedString);
	}
	
	public String toString(){
		/*
		int counter = 0;
		while(counter != numOfPoints()){
			String tempLine = point[counter].toString();
			counter++;
		}
		return polygonStatement = "[" + tempLine + "]: " + calculateArea();
		*/

		// FOR TESTING PURPOSES (NOT FINAL)
		return polygonStatement = "[" + "NEED TO ADD pointObject.toString() here" + "]: " + calculateArea();
	}

	public void setNumOfPoints(int p){
		numOfPoints = p;
	}

	public double calculateArea(){
		return area = 22222222;
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
}