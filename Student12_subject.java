package codes;

class op{
	
	private String rollNo;
	
	private String Name;
	
	private String Dept;
	
	private String subjects;
	
	public String getRollno() {
		return rollNo;
	}
	public String getname() {
		return Name;
	}
	public String getdept() {
		return Dept;
	}
	public String getSubject() {
		return subjects;
	}
	
	public void setdept(String d) {
		Dept = d;
	}
	
	public void setSubjects(String s) {
		subjects = s;
	}
	
	public op(String rollNo,String Name,String d,String s) {
		this.rollNo=rollNo;
		this.Name=Name;
		setdept(d);
		setSubjects(s);
		
	}
	
	public void details() {
		System.out.println("Subject id is :- "+ rollNo);
		System.out.println("Subject name is :- "+ Name);
		System.out.println("Subject MaxNO is :- "+ Dept);
		System.out.println("Subject mark obtain is :- "+ subjects);
	}
	
}


public class Student12_subject {

	

	public static void main(String[] args) {
		
		op sub[]=new op[3];
		
		sub[0]= new op("0002CB211001","Aadityaraj ","CSE","DSA");
		sub[1]= new op("0002CB211001","Aadityaraj ","CSE","DSA");
		sub[2]= new op("0002CB211001","Aadityaraj ","CSE","DSA");
		
		for(op k:sub) {
			k.details();
			System.out.print("\n");
			
		}		

	}

}
