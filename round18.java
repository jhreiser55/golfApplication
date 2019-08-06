import java.util.Scanner;
import java.util.ArrayList;
public class round18 {
	
	private int coursePar;
	private int myScore;
	private String courseName;
	private boolean frontOrBack;

	public round18(int coursePar, String courseName){
		this.coursePar = coursePar;
		this.courseName = courseName;
	}

	public round18(int coursePar, String courseName, Scanner s) {

		hole[] holes = new hole[17];
		System.out.println("Enter in hole by hole? y/n");
		String yORn = s.next();
		if(yORn.equals("y")){
			for(int i = 0; i < 18; i++) {
				System.out.println("Hole " + (i + 1) + ":");
				System.out.println("What is this holes par?");
				int holePar = s.nextInt();
				System.out.println("What did you shoot on this hole?");
				int holeStrokes = s.nextInt();
				System.out.println("How many putts?");
				int holePutts = s.nextInt();
				holes[i] = new hole(holePar,holeStrokes,holePutts);
			}
		}
		this.coursePar = s.nextInt();
		System.out.println("Course par is: " + coursePar);

	}
	public String getName(){
		return courseName;
	}

}
