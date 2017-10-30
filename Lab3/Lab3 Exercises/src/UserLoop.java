import java.util.Scanner;
public class UserLoop {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int start = 0;
		int finish = 0;
		
		System.out.println("Input a start value(included): ");
		start = input.nextInt();
		System.out.println("Input an ending value (excluded): ");
		finish = input.nextInt();
		
		if (finish < start) {
			System.out.println("Invalid input.");
		} else {
			for (int x = start; x < finish; x +=1) {
				System.out.println(x);
			}
		}
	}
}
