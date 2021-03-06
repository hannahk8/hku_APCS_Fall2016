public class HourglassCode {
	public static void main(String[] args) {
		printBase(); //Print the firstline
		topHalf(); //Print the top half
		printMiddle();
		bottomHalf();
		printBase();
	}

	public static void topHalf(){
		for (int i=0; i < 4; i++){//print each line
			//print spaces
			for (int j=1; j<=i+1; j++){
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int k = 8 - (2*i); k > 0; k -= 2) { 
				System.out.print("::");
			}
			System.out.println("/");

		}
	}
	
	public static void printBase(){
		System.out.print("|");
		for(int i = 0; i < 10; i ++){
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void bottomHalf(){
		for (int i= 4; i >= 0; i--){//print each line
			//print spaces
			for (int j = i; j >= 0; j--){
				System.out.print(" ");
			}
			System.out.print("/");
			for (int k = 8 - (2*i); k > 0; k -= 2) { 
				System.out.print("::");
			}
			System.out.println("\\");

		}
	}
	public static void printMiddle(){
		System.out.println("     ||");
	}
}
