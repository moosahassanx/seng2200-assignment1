import java.io.*;
import java.util.Scanner;

class main{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		MyPolygons unsortedList = new MyPolygons();
		//MyPolygons sortedList = new MyPolygons();
		
		Scanner file = new Scanner(new File("inputfile.txt"));
		String text = "";

		try{
			while(file.hasNextLine()){
				text = text + file.next() + " ";
			}
		}catch(Exception e){
			System.out.println("Error with reading files");
		}

		// split the line based on recognising "P " (including the space)
		String[] textSplit = text.split("P ");

		// print out each line after the split
		
		int splitCounter = 0;
		for(int i = 1; i < textSplit.length; i++){
			System.out.println(textSplit[i]);
			splitCounter++;
		}

		System.out.println("textSplit[1].charAt(0): " + textSplit[1].charAt(0));
		double testing = Double.parseDouble( textSplit[1].substring(0) );
		System.out.println("after assigning to double: " + testing);
		
		/*
		System.out.println();
		System.out.println("splitCounter after for loop: " + splitCounter);
		polygon[] polygonObject = new polygon[splitCounter];
		System.out.println();
		*/

		// print out the first letter of each string that has split
		/*
		int j = 1;
		while(j < textSplit.length){
			polygon polygonObject = new polygon();
			for( int f = 0; f < textSplit[j].charAt(0); f++ ){
				point[] pointArray = new point[];
				textSplit[j].nextInt() = 
			}



			System.out.println(textSplit[j].charAt(0));
			int numOfPoints = textSplit[j].charAt(0);
			j++;
		}
		*/


		file.close();
	}
}