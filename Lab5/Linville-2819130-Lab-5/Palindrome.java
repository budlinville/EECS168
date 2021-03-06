import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args){
		int userNum = 0;
		boolean palindrome = false;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a Number:");
		userNum = input.nextInt();
		
		palindrome = isPalindrome(userNum);
		if (palindrome) {
			System.out.println("The number is a Palindrome.");
		} else{
			System.out.println("The number is not a Palindrome.");
		}
		
		input.close();
	}
	public static boolean isPalindrome(int x){
		int xReverse = 0;
		xReverse = reverse(x);
		
		System.out.println("The Reverse of the Number is " + xReverse);
		if (x == xReverse){
			return(true);
		} else{
			return(false);
		}
	}
	public static int reverse(int x){
		int xLength = lengthOfNumber(x);
		int rev = 0;
		int digit = 0;
		
		System.out.println("The length of the Number is: " + xLength);
		
		for(int i = xLength; i >= 0; i-= 1){
			digit = x % 10;		//shaves off last digit of x
			for(int j = 1; j < i; j+= 1){
				digit = digit * 10;
			}
			rev = rev + digit;
			x = x / 10;
		}
		
		return(rev);
	}
	public static int lengthOfNumber(int x){
		int count = 0;
		while (x > 0){
			x = x / 10;
			count ++;
		}
		return(count);
	}
}
