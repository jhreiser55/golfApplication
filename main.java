import java.util.Scanner;
public class main{

	private static appState state;

	public static void main(String args[]){
	
		String input;
		Scanner userInput = new Scanner(System.in);

		try {
			state = appState.instance();
			if(args[0].endsWith(/*need to figure out file sav*/)){
				state.restore(args[0]);
				System.out.println("\nWelcome back " + state.getName();
				//Finish copying from interpreter.java line 41		

	}
}
