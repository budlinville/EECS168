import java.util.Scanner;
public class Multiples {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int multiple = 0;
		int howMany = 0;	//will decide how many rotations the loop must go through.
		
		System.out.println("What number do you wish to see multiples of?");
		multiple = input.nextInt();
		System.out.print("How many multiples?");
		howMany = input.nextInt();
		
		if (multiple < 1) {
			System.out.println("The amount of multiples must be greater than zero.");
		} else {
			for (int x = multiple; x <= (multiple * howMany); x += multiple) {
				System.out.println(x);
			}
		}
	}
}