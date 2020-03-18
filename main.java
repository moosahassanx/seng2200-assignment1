import java.io.*;
import java.util.Scanner;

class main{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		MyPolygons unsortedList = new MyPolygons();
		MyPolygons sortedList = new MyPolygons();
		
		Scanner file = new Scanner(new File("inputfile.txt"));
		String text = "";
		String newText = "";

		try{
			while(file.hasNext()){
				newText = file.next();
				
				if(newText.equals("P")){
					System.out.println("the file read P");
					
					int numOfPoints = file.nextInt();
					polygon polygonObject = new polygon(numOfPoints);

					System.out.println("numOfPoints: " + numOfPoints);
					point[] pointArray = new point[numOfPoints];
					
					int i = 1, j = 0;
					while(i <= numOfPoints){
						double x = file.nextDouble();
						double y = file.nextDouble();
						System.out.print ("(" + x + ", " + y + ")  \t   ");
						pointArray[j] = new point(x, y);
						polygonObject.insertPoint(x, y);
						System.out.println("distanceFromOrigin: " + pointArray[j].distanceFromOrigin());
						j++;
						i++;
					}

					System.out.println("polygonObject area: " + polygonObject.calculateArea());
				}
			}
		}catch(Exception e){
			System.out.println("Error with reading files");
		}


		// -------------------------- TESTING AREA -----------------------------



		// -------------------------------------------------------------------------------------------------------- FINAL PARTS OF THE CODE ------------------------------------------------------------------------------------
		sortedList = unsortedList;
		//sortedList.sortList();

		//System.out.println(unsortedList.toString());
		//System.out.println(sortedList.toString());

		file.close();
	}
}