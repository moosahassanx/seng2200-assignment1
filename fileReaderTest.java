import java.io.*;
import java.util.Scanner;

class fileReaderTest{
	Scanner x;

	public void openFile(){
		try{
			x = new Scanner(new File("inputfile.txt"));			// instead of reading from your keyboard, itll try to read from inputfile.txt
		}
		catch(Exception e){
			System.out.println("could not find file");
		}
	}

	public void readFile(){
		while(x.hasNext()){									// hasNext() - as long as theres something there, itll continue
			String a = x.next();
			String b = x.next();
			String c = x.next();

			System.out.println("%s %s %s\n" + a + b + c);
		}
	}

	public void closeFile(){
		x.close();
	}
}