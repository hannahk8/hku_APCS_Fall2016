
public class LotsOfCopies {
	public static void main(String[] args){
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(arrMain);
		
		
		int a = 10;
		int b = a;
		a = 1000;
		System.out.println(a);
		System.out.println(b);
		
		int[] array = {1, 2, 3, 4, 5};
		int[] barray = array;
		array[0] = 1000;
		System.out.println(array[0]);
		System.out.println(barray[0]);


	}
	
	public static void changeMe(int x, String str, int[] arr){
		x = 8;
		str = "NO";
		arr[0] = 100;
	}
}