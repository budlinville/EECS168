/* Bud Linville
 * 2819130
 */
import java.util.Scanner;
public class MethodPractice {
	public static void main(String[] args){
		int num1, num2, max = 0;
		double radius, area = 0;
		
		String userWord = "";
		int timesToPrint = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input two numbers:");
			num1 = input.nextInt();
			num2 = input.nextInt();
			input.nextLine();
			
			max = max(num1, num2);
			
			System.out.println("The max of " + num1 + " & "
					+ num2 + "is: " + max);

			System.out.println("Input a radius: ");
			radius = input.nextDouble();
			area = sphereArea(radius);
			System.out.println("The area of a sphere with this "
					+ "radius is: " + area);

			System.out.println("Input a string:");
			userWord = input.next();

			System.out.println("How many times do you want to " 
					+ "print it?: ");
			timesToPrint = input.nextInt();
			printWord(userWord, timesToPrint);
			
	}
	//Take in two integers
	//returns the larger of the two numbers
	public static int max(int a, int b){
		if (a > b){
			return(a);
		} else{
			return(b);
		}
	}
	
	//takes in a radius
	//if the radius is greater than zero, return the area 
	//of a sphere with that radius, otherwise return 0.0
	public static double sphereArea(double radius){
		final double PI = 3.14159;
		double area = PI * radius * radius;
		return(area);
	}
	
	/* Accepts a String and an integer
	 * This function returns nothing, but will print the 
	 * parameter word over and over, timesToPrint times, each 
	 * on its own line. If timesToPrint is less than or equal 
	 * to zero, then nothing is printed
	 */
	public static void printWord(String word, int timesToPrint){
		for (int i = 0; i < timesToPrint; i++){
			System.out.println(word);
		}
	}
}
