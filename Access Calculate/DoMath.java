
public class DoMath {
	public static void main(String[]args){
		//part 1
		System.out.println(Calculate.square(10));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(5.0, 7.0));
		System.out.println(Calculate.average(5.0, 6.0, 7.0));
		System.out.println(Calculate.toDegrees(10.0));
		System.out.println(Calculate.toRadians(10.0));
		System.out.println(Calculate.discriminant(1.0, 2.0, 3.0));
		System.out.println(Calculate.toImproperFrac(1, 1, 2));
		System.out.println(Calculate.toMixedNum(8, 4));
		System.out.println(Calculate.foil(2, -2, 2, -2, "x"));
		
		//part 2
		System.out.println(Calculate.toImproperFrac(1, 1, 2));
		System.out.println(Calculate.isDivisibleBy(4, 2));
		System.out.println(Calculate.absValue(-1));
		System.out.println(Calculate.max(1, 2));
		System.out.println(Calculate.max(1.0, 2.0, 3.0));
		System.out.println(Calculate.min(1, 2));
		System.out.println(Calculate.round2(5.004));

		//part 3
		System.out.println(Calculate.exponent(2, 3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(6));
		System.out.println(Calculate.gcf(6, 4));
		System.out.println(Calculate.quadForm(1, 1, 3));
		System.out.println(Calculate.sqrt(4));
		
		//part 4
		//System.out.println(Calculate.quadForm(1, 1, 3));
	}
}
