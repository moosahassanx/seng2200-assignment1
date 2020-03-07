import java.util.Scanner;
import java.lang.Math ;

public class point{
	private double xCoord, yCoord, distance;
	private String pointStatement;

	public point(double x, double y){
		xCoord = x;
		yCoord = y;
	}

	public double distanceFromOrigin(){
		distance = Math.sqrt(Math.pow(Math.abs(xCoord), 2) + Math.pow(Math.abs(yCoord), 2));
		return distance;
	}

	public String toString(){
		return pointStatement = "(" + xCoord + " , " + yCoord + ")";
	}
}