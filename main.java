import java.io.*;
import java.util.Scanner;

class main{
	public static void main(String[] args) throws IOException{
		MyPolygons unsortedList = new MyPolygons();
		
		Scanner file = new Scanner(new File("inputfile.txt"));											// CHANGE TO ARGZ SO IT RUNS LIKE java PA1 Test.dat
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
		file.close();
		// -------------------------------------------------------------------------------------------------------- FINAL PARTS OF THE CODE ------------------------------------------------------------------------------------
		
		System.out.println("Unsorted List:");
		System.out.println(unsortedList.toString());
		unsortedList.insertSort();
		System.out.println(unsortedList.toString());
	}
}