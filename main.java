import java.util.Scanner;
public class main{
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter in the course you played");
		String courseName = s.nextLine();
		System.out.println("What is " + courseName + "'s par?");
		int coursePar = s.nextInt();
		round18 current = new round18(coursePar,courseName,s);
		System.out.println(current.getName() + " sucks lol :p");		

	}
}
