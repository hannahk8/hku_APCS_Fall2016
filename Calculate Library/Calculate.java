
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
	
	public static String toImproperFrac(int wholeNum, int numerator, int denom){
		return(((wholeNum*denom)+numerator)+ "/" + denom);
	}
	
	public static String toMixedNum(int numerator, int denominator){
		int remainder = numerator%denominator;
		return((numerator - remainder)/denominator + "_" + 
				numerator%denominator + "/" + denominator);
	}
	
	public static String foil(int a, int b, int c, int d, String x){
		return((a*c) + x + "^2" + "+" + (c*d) + (a*d) + x + "+" + (b*d) );
	}
	
	//part two
	public static boolean isDivisibleBy(int a, int b){
		if(a % b == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static double absValue(double num){
		if(num >= 0){
			return num;
		}else{
			return num + (num * -1);
		}
	}
	
	public static int max(int a, int b){
		if(a > b){
			return a;
		}else{
			return b;
		}
	}
	
	public static double max(double a, double b, double c){
		if(a > b && a > c){
			return a; 
		}
		if(b > a && b > c){
			return b;
		}
		if(c > a && c > b){
			return c;
		}
	}
	
	public static int min(int a, int b){
		if(a > b){
			return b;
		}else{
			return a;
		}
	}
	
	public static double round2(double num){
		int integer = (int) (num*100);
		
	}
	
	//part 3
	public static double exponent(double a, int b){
		for(int i = 0; i < b; i++){
			a *= a;
		}
		return a;
	}
	
	public static int factorial(int a){
		int num = 1;
		for(int i = 1; i <= a; i++){
			i *= a;
			num = i;
		}
		return num;
	}
	
	public static boolean isPrime(int a){
		int factor = a - 1;
		while(a % factor != 0){
			factor -= 1;
			if(factor == 0){
				return false;
			}
		}
		return false;
	}
}



