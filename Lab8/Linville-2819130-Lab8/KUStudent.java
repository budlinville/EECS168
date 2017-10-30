public class KUStudent {
	private String stud_fname;
	private String stud_lname;
	private String stud_kuid;
	private String stud_dpt;
	
	//initializes an instance in which no info about student has been passed as a parameter
	KUStudent(){
		stud_fname = "";
		stud_lname = "";
		stud_kuid = "";
		stud_dpt = "";
	}
	
	//initializes an instance in which all info about student has been passed as parameters.
	KUStudent(String fName, String lName, String kuid, String department){
		stud_fname = fName;
		stud_lname = lName;
		stud_kuid = kuid;
		stud_dpt = department;
	}
	
	public void set_name(String f, String l){
		stud_fname = f;
		stud_lname = l;
	}
	
	public void set_kuinfo(String kuid, String dpt){
		stud_kuid = kuid;
		stud_dpt = dpt;
	}
	
	public String get_fname(){
		return(stud_fname);
	}
	
	public String get_lname(){
		return(stud_lname);
	}
	
	public String get_id(){
		return(stud_kuid);
	}
	
	public String get_dept(){
		return(stud_dpt);
	}
}
