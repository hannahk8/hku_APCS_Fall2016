//Hannah Ku AP Compsci Second Period Collaborative Program 10/2/16
//This program asks the user how many integers they want to enter, prompts them for the integers,
//and prints out the smallest #, largest #, sum of all even #s, and largest even #.

import java.util.*;

public class CollabProgram {
	public static void main(String[]args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many integers do you want to enter? ");
		int inputCount = userInput.nextInt();
		System.out.print("Enter " + inputCount + " integers: ");
		int inputNumber = userInput.nextInt();
		
		int max = inputNumber;
		int min = inputNumber;
		int evenSum = 0;
		int evenMax = -1; // -1 means there is no even max.
		
		if(inputNumber % 2 == 0){
			evenMax = inputNumber;
			evenSum += inputNumber;
		}
		
		for(int i = 0; i < inputCount - 1; i ++){
			inputNumber = userInput.nextInt();
			if(inputNumber < min){
				min = inputNumber;
			}
			if(inputNumber > max){
				max = inputNumber;
			}
			if(inputNumber > evenMax && inputNumber % 2 == 0){
					evenMax = inputNumber;
			}
			if(inputNumber % 2 == 0){
				evenSum += inputNumber;
			}
		}
		
		System.out.println("Smallest number: " + min);
		System.out.println("Largest number: " + max);
		System.out.println("Sum of all even numbers: " + evenSum);
		System.out.println("Largest even number: " + evenMax);
	}
}	
