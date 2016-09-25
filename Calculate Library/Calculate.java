// Hannah Ku Calculate Library 09/24/16 This is a math library that i created.
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
		return((a*c) + x + "^2" + "+" + ((c*d) + (a*d)) + x + "+" + (b*d) );
	}
	
	//part two
	public static boolean isDivisibleBy(int num, int divisor){
		if(divisor == 0){
			throw new IllegalArgumentException("divisor cannot be zero");
		}
		if(num % divisor == 0){
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
	
	public static int max(int num1, int num2){
		if(num1 > num2){
			return num1;
		}else{
			return num2;
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
		return 0.0;
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
		double answer;
		if(100*num - integer >= .5){
			answer = (int) (num * 100 + 1);
			answer = answer / 100;
		}else{
			answer = (int) (num * 100);
			answer = answer / 100;
		}
		return answer;
	}
	
	//part 3
	public static double exponent(double a, int b){
		if(b < 0){
			throw new IllegalArgumentException("exponent power cannot be negative.");
		}
		for(int i = 0; i < b; i++){
			a *= a;
		}
		return a;
	}
	
	public static int factorial(int number){
		if(number <= 0){
			throw new IllegalArgumentException("factorial input cannot be negative.");
		}
		int num = 1;
		for(int i = 1; i <= number; i++){
			i *= number;
			num = i;
		}
		return num;
	}
	
	public static boolean isPrime(int num){
		int factor = num - 1;
		while(num % factor != 0){
			factor -= 1;
			if(factor == 1){
				return true;
			}
		}
		return false;
	}
	
	public static int gcf(int num1, int num2){
		if(num1 == 0){
			return num2;
		}
		if(num2 == 0){
			return num1;
		}
		for(int i = num1; i > 1; i -= 1){
			for(int j = num2; j > 1; j -= 1){
				if(isDivisibleBy(num1, i) && isDivisibleBy(num2, j) && i == j){
					return i;
				}
			}
		}
		return 1;
	}
	
	public static double sqrt(double num){
		if(num < 0){
			throw new IllegalArgumentException("your input cannot be negative");
		}
		double t;
		double squareRoot = num/2.0;
		do{
			t = squareRoot;
			squareRoot = (t+(num/t)/2.0);
		}while((t - squareRoot) != 0.0);
		round2(squareRoot);
		return squareRoot;
	}
	
	//part 4
	public static String quadForm(int num1, int num2, int num3){
		double number1 = (double)(num1);
		double number2 = (double)(num2);
		double number3 = (double)(num3);

		double discrim = discriminant(number1, number2, number3);
		
		String strg = "";
		
		if(discrim < 0.0){
			return strg + "no real roots";
		}
		if(discrim == 0.0){
			double answer = (-1.0 *number2)/(2.0 *number1);
			return strg += round2(answer);
		}
		if(discrim > 0.0){
			double answer1 = ((-1.0*number2) + sqrt(discrim))/(2.0*number1);
			double answer2 = ((-1.0*number2) - sqrt(discrim))/(2.0*number1);
			round2(answer1);
			round2(answer2);
			return strg += answer1 + "and" + answer2;
		}
		return strg += -1;
	}
}