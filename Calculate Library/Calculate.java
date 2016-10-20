
public class Calculate {
	public static int square(int num){
		int answer;
		answer=num*num;
		return (answer);
	}
	public static int cube(int num){
		int answer;
		answer=num*num*num;
		return (answer);
	}
	public static double average(double num){
		double answer;
		answer=num+num/2;
		return (answer);
	}
	public static double average(double num1, double num2, double num3){
		double answer;
		answer=num1+num2+num3/3;
		return (answer);
	}
	public static double toDegrees(double num){
		double answer;
		answer=num*3.14159/180;
		return (answer);
	}
	public static double toRadians(double num){
		double answer;
		answer=num*180/3.14159;
		return (answer);
	}
	public static double discriminant(double num1, double num2, double num3){
		double answer;
		answer=num2*num2-4*num1*num3;
		return (answer);
	}
	public static int toImproperFrac(int num1,int num2,int num3){
		int answer;
		answer=num1+num2/num3;
		return (answer);
	}
	public static int toMixedNum(int num1, int num2) {
		int answer;
		answer=num1/num2;
		return (answer);
	}
	public static int foil(int num1, int num2, int num3, int num4, int numx){
		int answer;
		answer=(num1*numx+num2)*(num3*numx+num4);
		return (answer);
	}
	boolean isDivisibleBy(int num1, int num2){
		if( num1%num2<=0);
		return true;
	}
	public static double absValue(double num1){
		double num2;
		num2=num1*-1;
		if( num1 < 0){
			return num2;
		}
		else return num1;
	}
	
}
	
