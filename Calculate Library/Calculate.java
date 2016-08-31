
public class Calculate {
	public static int square(int num){
		return(num*num);
	}
	
	public static int cube(int num){
		return(num*num*num);
	}
	
	public static double average(double num1, double num2){
		return((num1+num2)/2);
	}
	
	public static double average(double num1, double num2, double num3){
		return((num1+num2+num3)/3);
	}
	
	public static double toDegrees(double num){
		return((num*180)/3.14159);
	}
	
	public static double toRadians(double num){
		return((num*3.14159)/180);
	}
	
	public static double discriminant(double a, double b, double c){
		return((b*b)-(4*a*c));
	}
	
	public static string toImproperFrac(int wholeNum, int numerator, int denom){
		return(((wholeNum*denom)+numerator)+ "/" + denom);
	}
	
	public static string toMixedNum(int numerator, int denominator){
		int remainder = numerator%denominator;
		return((numerator - remainder)/denominator + "_" + 
				numerator%denominator + "/" + denominator);
	}
}

