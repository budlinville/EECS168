
import java.util.Scanner;
public class Summation {
	public static void main(String[] args){
		int multiple = 0;
		int endValue = 0;
		int summation = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a multiple larger than 1: ");
		multiple = input.nextInt();
		System.out.println("Please input a positive integer as the end value: ");
		endValue = input.nextInt();
		
		for(int i = 0; i <= endValue; i += multiple){
			summation = summation + i;
		}
		
		System.out.println("The summation is: " + summation);
	}
}
