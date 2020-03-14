import java.io.*;
import java.util.Scanner;

class main{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		//MyPolygons myPolygonsObject = new MyPolygons();
		//System.out.println(polygonTestObject.toString());
		
		// ------------------------------------------------------------------------------------------------------ FILE READING SECTION ---------------------------------------------------------------------
		Scanner file = new Scanner(new File("inputfile.txt"));
		String text = "";

		try{
			while(file.hasNextLine()){
				text = text + file.next() + " ";
			}
		}catch(Exception e){
			System.out.println("Error with reading files");
		}

		String[] textSplit = text.split("P ");

		for(int i = 1; i < textSplit.length;i++){
			System.out.println(textSplit[i]);
		}

		/*
		System.out.println(textSplit[0]);
		System.out.println(textSplit[1]);
		System.out.println(textSplit[2]);
		System.out.println(textSplit[3]);
		*/

		file.close();
		// ------------------------------------------------------------------------------------------------------

		// OUTPUT RESULT (FAKE)
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("***************************************** FAKE OUTPUT ************************************");
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