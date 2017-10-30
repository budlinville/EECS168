import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Letter_Counter {
	public static void main(String[] args){
		String fileName = "";
		Scanner input = new Scanner(System.in);
		FileReader myFileReader = null;
		BufferedReader myBufferedReader = null;
		FileWriter myFileWriter = null;
		BufferedWriter myBufferedWriter = null;
		
		int[] charArrayUpperCase = new int[26];		//two arrays to avoid ascii-91 through ascii-96
		int[] charArrayLowerCase = new int[26];
		int numberASCII;	//the numerical value of the ascii representation of certain characters
		
		String outFileName = "";
		
		boolean validInput = false;
		do {
			try {
				System.out.print("Input a file name: ");
				fileName = input.next();
				input.nextLine();
				
				myFileReader = new FileReader(fileName);
				myBufferedReader = new BufferedReader(myFileReader);
				
				String line = myBufferedReader.readLine();
				
				while(line != null){
					for (int i = 0; i < line.length(); i++){
						numberASCII = (int)(line.charAt(i));
						if (numberASCII >= 65 && numberASCII <= 90){ 
							charArrayUpperCase[numberASCII - 65]++;
						} else if (numberASCII >= 97 && numberASCII <= 122){
							charArrayLowerCase[numberASCII - 97]++;
						}
					}
					
					line = myBufferedReader.readLine();	//progression
				}
				
				validInput = true;
			} catch (Exception e){
				System.err.println("Error: " + e.getMessage());
				validInput = false;
			}
		} while (validInput == false);
		
		do {
			try{
				System.out.print("Input an out file name: ");
				outFileName = input.next();
				input.nextLine();
				
				myFileWriter = new FileWriter(outFileName);
				myBufferedWriter = new BufferedWriter(myFileWriter);
				
				for(int i = 0; i < 26; i ++){
					myBufferedWriter.write((char)(i + 65) + "=" + charArrayUpperCase[i] + "\n");
				}
				for(int i = 0; i < 26; i ++){
					myBufferedWriter.write((char)(i + 97) + "=" + charArrayLowerCase[i] + "\n");
				}
				
				myBufferedWriter.close();
				
				validInput = true;
			} catch(Exception e){
				System.err.println("Error: " + e.getMessage());
				validInput = false;
			}
		} while (validInput == false);
		
		input.close();
	}
}
