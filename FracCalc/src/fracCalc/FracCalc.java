package fracCalc;
import java.util.*;
public class FracCalc {
//requests input, reads it and directs to produceAnswer
    public static void main(String[] args){
    	Scanner userInput = new Scanner(System.in);
    	String input;
    	System.out.println("Enter your problem or enter quit to quit");
    	do{
    		input = userInput.nextLine();
    		if(!(input.equals("quit"))){
    			System.out.println(produceAnswer(input));
    		}
    	}while(!(input.equals("quit")));
    	
        // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input){
    	// opVals is short for operand values
    	String expression = input;
    	String[] output = expression.split(" ");
    	
        // TODO: Implement this function to produce the solution to the input
        
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
