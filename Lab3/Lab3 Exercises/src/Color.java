/* Bud Linville
 * EECS 168
 * 
 * Program will output the color a certain number inputted
 * by the use (in nanometers) falls in.
 */

import java.util.Scanner;
public class Color {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double userNum = 0; //number inputted by user.
	
		System.out.println("Enter a wavelength in nm. ");
		userNum = input.nextDouble();
	
		if (userNum < 380 || userNum >= 750){
			System.out.println("The entered wavelength is not a part of the visible spectrum.");
		} else if(userNum < 450){
			System.out.println("The color is violet.");
		} else if(userNum < 495){
			System.out.println("The color is blue.");
		} else if(userNum < 570){
			System.out.println("The color is green");
		} else if(userNum < 590){
			System.out.println("The color is yellow.");
		} else if(userNum < 620){
			System.out.println("The color is orange.");
		} else if(userNum < 750){
			System.out.println("The color is red.");
		} 
	}
}
