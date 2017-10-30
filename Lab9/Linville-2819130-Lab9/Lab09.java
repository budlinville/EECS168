import java.util.Scanner;
public class Lab09 {
	public static void main(String[] args){
		int numRows = 0;
		int numColumns = 0;
		int[][] array2D = null;
		ArrayHelper ah = new ArrayHelper();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many rows?: ");
		numRows = input.nextInt();
		System.out.print("How many columns?: ");
		numColumns = input.nextInt();
		
		array2D = new int[numRows][numColumns];
		
		for (int i = 0; i < numRows; i++){
			for (int j = 0; j < numColumns; j++){
				System.out.println("Enter a value for position (" + i + "," + j + "): ");
					array2D[i][j] = input.nextInt();
			}
		}
		ah.print2DArray(array2D);
		for (int i = 0; i < array2D.length; i ++){
			System.out.print("row " + i + " sum = " + ah.arraySum(array2D[i]) + ", ");
			System.out.println("avg = " + ah.arrayAvg(array2D[i]));
		}
		System.out.println("The largest value in the array is = " + ah.arrayMax2D(array2D));
		System.out.println("The sum for the entire array is = " + ah.arraySum2D(array2D));
		System.out.println("The average for the entire array is = " + ah.arrayAvg2D(array2D));
	}
}
