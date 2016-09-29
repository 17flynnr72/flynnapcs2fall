import java.util.*;

public class ProcessingNumbers {
	public static void main (String[] args){
		Scanner userInput = new Scanner(system.in);
		int input; int total = 0;
		System.out.println(" Input Numbers");
		while(userInput.nextInt()){
			input = userInput.nextInt();
			total+=input;
		}
		System.out.println(total);
	}

}
