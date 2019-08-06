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

		hole[] holes = new hole[19];
		System.out.println("Enter in hole by hole? y/n");
		String yORn = s.next();
		if(yORn.equals("y")){
			for(int i = 1; i < 19; i++) {
				System.out.println("Hole " + i + ":");
				System.out.println("What is this holes par?");
				int holePar = s.nextInt();
				System.out.println("What did you shoot on this hole?");
				int holeStrokes = s.nextInt();
				System.out.println("How many putts?");
				int holePutts = s.nextInt();
				holes[i] = new hole(holePar,holeStrokes,holePutts);
			}
			//calculating total putts in the round
			int totalPutts = 0;
			for(int i = 1; i < 19; i++){
				totalPutts += holes[i].getPutts();
			}
			System.out.println("You had " + totalPutts + " putts today!");

			//calculating total score in the round
			int totalScore = 0;
			for(int i = 1; i < 19; i++){
				totalScore += holes[i].getScore();
			}
			System.out.println("You shot a " + totalScore + " today!");
			
		}
		else
		{}

	}
	public String getName(){
		return courseName;
	}

}
