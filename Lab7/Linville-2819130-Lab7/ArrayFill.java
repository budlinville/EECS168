import java.util.Scanner;
public class ArrayFill {
	public static void main(String[] args){
		boolean validInput = false;
		double[] nums = null;	//first array
		double[] arrs = null;	//second array
		int firstArraySize = 0;
		int secondArraySize = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (validInput == false){
			System.out.print("Input an array size: ");
			firstArraySize = input.nextInt();
			if (firstArraySize > 0){
				validInput = true;
			} else {
				System.out.print("\nInvalid input. ");
			}
		}
		validInput = false;		//resets
		
		nums = new double[firstArraySize];
		
		System.out.println("\nNow please enter " + firstArraySize + " numbers.");
		for (int i = 0; i < nums.length; i++){
			System.out.print("Enter a number into your array: ");
			nums[i] = input.nextDouble();
		}
		printArray(nums);
		
		while (validInput == false){
			System.out.print("Input a new size: ");
			secondArraySize = input.nextInt();
			if (secondArraySize > firstArraySize){
				validInput = true;
			} else {
				System.out.print("Invalid input. ");
			} 
		}
		
		arrs = arrayResize(nums, secondArraySize);
		
		System.out.println("You need to add " + (secondArraySize - firstArraySize) + " value(s).");
		for (int i = nums.length; i < arrs.length; i++){
			System.out.print("Input a number to add to your array: ");
			arrs[i] = input.nextDouble();
		}
		
		printArray(arrs);
	}
	
	public static void printArray(double[] arrs){
		System.out.println("\nHere are all the numbers in your array:");
		for (int i = 0; i < arrs.length; i++){
			if (i == 0){
				System.out.print("[" + arrs[i] + ", ");
			} else if (i == arrs.length - 1){
				System.out.println(arrs[i] + "]\n" );
			} else {
				System.out.print(arrs[i] + ", ");
			}
		}
	}
	
	public static double[] arrayResize(double[] oldArray, int newSize){
		double[] newArray = new double[newSize];
		
		//initializes
		for (int i = 0; i < newArray.length; i++){
			newArray[i] = 0;
		}
		
		//fills new array with values of old array
		for (int i = 0; i < oldArray.length; i++){
			newArray[i] = oldArray[i];
		}
		return(newArray);
	}
}
