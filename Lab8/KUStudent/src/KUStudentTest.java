import java.util.Scanner;
public class KUStudentTest {
	public static void main(String[] args){
		String firstName = "";
		String lastName = "";
		String id = "";
		String dpt = "";
		KUStudent student = new KUStudent();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the student's name: ");
		firstName = input.next();
		lastName = input.next();
		student.set_name(firstName, lastName);
		
		System.out.println("Please input the student's KUID and department: ");
		id = input.next();
		dpt = input.next();
		student.set_kuinfo(id, dpt);
		
		writeOutput(student);
	}
	
	public static void writeOutput(KUStudent std){
		System.out.println("Student: " + std.get_fname() + " " + std.get_lname());
		System.out.println("KUID: " + std.get_id());
		System.out.println("Department: " + std.get_dept());
	}
}
