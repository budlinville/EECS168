/* File Name:  ConvertTemperature.java
 * Author: Bud Linville
 * Assignment:   EECS-168/169 Lab 2
 * Description:  This program will convert the input temperature from Fahrenheit to Celsius.
 * Date: 9/14/15
 */
import java.util.Scanner;
public class ConvertTemperature {
	public static void main(String[] args){
		double f = 0.0; //fahrenheit
		double c = 0.0; //celcius
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter a value for temperature in Fahrenheit:");
		f = input.nextDouble();
		c = (f - 32.0) * (5.0 / 9);
	
		System.out.print(f + " degrees in celcius is equal to " + c + " degrees in celcius.");
	}
}
