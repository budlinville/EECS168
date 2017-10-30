import java.util.Scanner;
public class SumofDigits {
	public static void main(String[] args){
		int userNum = 0;
		int sumOfDigits = 0;
		boolean keepLooping = true;
		Scanner input = new Scanner(System.in);
		
		while (keepLooping == true){
			System.out.println("Please enter a No:");
			userNum = input.nextInt();
			sumOfDigits = addDigits(userNum);
			
			System.out.println("The sum of the digits is: "
					+ sumOfDigits);
			System.out.println("Want to try again(y=1/n=0)?");
			if (input.next().equals("1")){
				keepLooping = true;
			} else{
				keepLooping = false;
			}
		}
		input.close();
		
	}
	public static int addDigits(int num){
		int modNum = 0;
		int totalNum = 0;
		while (num > 0){
			modNum = num % 10;
			totalNum = totalNum + modNum;
			num = num / 10;
		}
		return(totalNum);
	}
}
