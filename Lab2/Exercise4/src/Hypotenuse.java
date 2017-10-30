/* File Name: Hypotenuse.java
 * Author: Bud Linville budlinville@gmail.com
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will calculate the value of a hypotenuse of a right triangle based upon the side lengths inputted by the user.
 * Date: 9/14/15
 */
import java.lang.Math;
import java.util.Scanner;
public class Hypotenuse {
	public static void main(String[] args){
		double a = 0.0; //first side of the right triangle.
		double b = 0.0; //second side of the right triangle.
		double c = 0.0; //hypotenuse calculated by program.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter values for sides a & b.");
		a = input.nextDouble();
		b = input.nextDouble();
		input.nextLine();
		
		System.out.println("Enter values for side 'a' & side 'b'.");
		c = Math.sqrt((a * a) + (b * b));
		System.out.println("The value of the hypotenuse of a right triangle with side lengths " + a + " & " + b + " is " + c + ".");
	}
}
