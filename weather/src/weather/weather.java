package weather;

import java.io.*;
import java.util.*;

public class WeatherDiff{
	public static void main (String [] args) throws FileNotFoundException{
		Scanner input = new Scanner (new File("./data/weather.txt"));
		String text = input.next();
		System.out.println(text);
	}

	
}
