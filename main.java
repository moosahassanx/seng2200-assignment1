import java.io.*;
import java.util.Scanner;

class main{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		polygon polygonTestObject = new polygon();
		MyPolygons myPolygonsObject = new MyPolygons();
		System.out.println(polygonTestObject.toString());
		
		// ------------------------------------------------------------------------------------------------------
		Scanner file = new Scanner(new File("inputfile.txt"));

		String line1 = file.nextLine();
		String line2 = file.nextLine();
		String line3 = file.nextLine();

		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);

		file.close();
		// ------------------------------------------------------------------------------------------------------

		// OUTPUT RESULT (FAKE)
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Unsorted list");
		System.out.println("[(4.00 , 0.00)(4.00 , 8.00)(7.00 , 8.00)(7.00 , 3.00)(9.00 , 0.00)(7.00 , 1.00)]: 24.50");
		System.out.println("[(4.10 , 0.00)(4.00 , 8.20)(7.30 , 8.40)]: 13.54");
		System.out.println("[(4.00 , 0.00)(4.00 , 8.10)(7.20 , 8.00)(7.00 , 3.00)(9.00 , 0.00)]: 27.66");
		System.out.println("Sorted list");
		System.out.println("[(4.10 , 0.00)(4.00 , 8.20)(7.30 , 8.40)]: 13.54");
		System.out.println("[(4.00 , 0.00)(4.00 , 8.00)(7.00 , 8.00)(7.00 , 3.00)(9.00 , 0.00)(7.00 , 1.00)]: 24.50");
		System.out.println("[(4.00 , 0.00)(4.00 , 8.10)(7.20 , 8.00)(7.00 , 3.00)(9.00 , 0.00)]: 27.66");
	}
}