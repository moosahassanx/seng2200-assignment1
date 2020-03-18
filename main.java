import java.io.*;
import java.util.Scanner;

class main{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		MyPolygons unsortedList = new MyPolygons();
		
		Scanner file = new Scanner(new File("inputfile.txt"));
		String newText = "";

		try{
			while(file.hasNext()){
				newText = file.next();
				
				if(newText.equals("P")){					
					int numOfPoints = file.nextInt();
					
					polygon polygonObject = new polygon(numOfPoints);

					point[] pointArray = new point[numOfPoints];
					
					int i = 1, j = 0;
					while(i <= numOfPoints){
						double x = file.nextDouble();
						double y = file.nextDouble();
						pointArray[j] = new point(x, y);
						polygonObject.insertPoint(x, y);
						j++;
						i++;
					}

					unsortedList.append(polygonObject);
				}
			}
		}catch(Exception e){
			System.out.println("Error with reading files");
		}


		// -------------------------- TESTING AREA -----------------------------


		// -------------------------------------------------------------------------------------------------------- FINAL PARTS OF THE CODE ------------------------------------------------------------------------------------
		
		System.out.println("Unsorted List");
		System.out.println(unsortedList.toString());
		/*
		sortedList = unsortedList;
		sortedList.insertionSort();
		
		System.out.println("Sorted List");
		System.out.println(sortedList.toString());
		*/
		file.close();
	}
}