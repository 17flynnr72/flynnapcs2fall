import java.util.*;
//Ryan Flynn
public class ProjColab {
	public static void main (String[] args){
		Scanner userInput = new Scanner(System.in);
		int input; int total = 0;
		System.out.println(" Input Numbers");
		{
			input = userInput.nextInt();
			total+=input;
		}
		System.out.println(total);
	}

}
// the job of this code is to ultimately find the sum of integers and find the min and max