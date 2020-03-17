import java.io.*;
import java.util.Scanner;

class main{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		MyPolygons unsortedList = new MyPolygons();
		//MyPolygons sortedList = new MyPolygons();
		
		Scanner file = new Scanner(new File("inputfile.txt"));
		String text = "";
		String newText = "";

		try{
			while(file.hasNext()){
				newText = file.next();
				if(newText.equals("P")){
					System.out.println("the file read P");
					polygon polygonObject = new polygon();
					int numOfPoints = file.nextInt();
					System.out.println("numOfPoints: " + numOfPoints);
					point[] pointArray = new point[numOfPoints];
					int i = 1, j = 0;
					while(i <= numOfPoints){
						double x = file.nextDouble();
						double y = file.nextDouble();
						System.out.println("(" + x + ", " + y + ")");
						pointArray[j]. = new point(x, y);
						j++;
						i++;
					}
				}
			}
		}catch(Exception e){
			System.out.println("Error with reading files");
		}

		file.close();
	}
}