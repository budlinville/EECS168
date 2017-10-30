
import java.util.Scanner;
public class IntArray {
	public static void main(String[] args){
		boolean validInput = false;
		int arraySize = 0;
		int tempValue = 0;		//temporary number that stores number in array permanently
		int sum = 0, min = 0, max = 0, average = 0;
		int[] array = null;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Input an array size: ");
			arraySize = input.nextInt();
			if (arraySize < 1){
				System.out.print("Not a valid input. ");
				validInput = false;
			} else {
				validInput = true;
			}
		} while (validInput == false);
		
		System.out.println("Now please enter " + arraySize + " number(s).");
		array = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++){
			System.out.print("Input a number into your array: ");
			array[i] = input.nextInt();
		}
		
		System.out.println("Here are all the numbers in your array:");
		for (int i = 0; i < arraySize; i++){
			System.out.println(array[i]);
		}
		
		max = array[0];	//had to change the value of max from zero to the first instance in case 0 was greater than any number within the array;
		min = array[0];	// ^similar to above
		
		for (int i = 0; i < arraySize; i++){
			sum += array[i];
			
			if (array[i] > max){
				max = array[i];
			}
			if (array[i] < min){
				min = array[i];
			}
		}
		
		average = sum / arraySize;
		
		System.out.println("The sum of all the values is: " + sum);
		System.out.println("The average of all the values is: " + average);
		System.out.println("The largest value is: " + max);
		System.out.println("The smallest value is: " + min);
	}
}