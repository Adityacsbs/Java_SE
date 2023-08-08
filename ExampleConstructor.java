package codes;

import java.util.*;

class Subject{
	
	private String subId;
	
	
	
	private String name;
	
	private int MaxNo;
	
	private int MarkObtain;
	
	public String getSubId() {
		return subId;
	}
	public String getName() {
		return name;
	}
	public int getmaxNo() {
		return MaxNo;
	}
	public int getmarkObtain() {
		return MarkObtain;
	}
	
	public void setmaxNo(int m) {
		MaxNo = m;
	}
	
	public void setmarkObtain(int mo) {
		MarkObtain = mo;
	}
	
	public Subject(String id,String name) {
		subId = id;
		this.name=name;
	}
	
	public Subject(String id,String name,int m,int MO) {
		subId = id;
		this.name=name;
		setmarkObtain(MO);
		setmaxNo(m);
	}
	public Subject( ) {
		subId = "Math303";
		name="none";
		
	}
	
	public void details() {
		
		System.out.println("Subject id is :- "+ subId);
		System.out.println("Subject name is :- "+ name);
		System.out.println("Subject MaxNO is :- "+ MaxNo);
		System.out.println("Subject mark obtain is :- "+ MarkObtain);

	}
	
}


public class ExampleConstructor {

	public static void main(String[] args) {
		
		Subject s = new Subject("Math303","adityaraj");
		
		s.setmaxNo(100);
		s.setmarkObtain(94);

		s.details();
		
		System.out.print("\n");
		
		Subject s1 = new Subject("Math303","adityaraj",100,90);
		
		s1.details();
		
		System.out.print("\n");
		
		Scanner m=new Scanner(System.in);
		
		int t,o;
		
		System.out.println("enter the total number : ");
		t = m.nextInt();
		
		System.out.println("enter the number obtain : ");
		o = m.nextInt();
		
		Subject s2 = new Subject();
		
		s2.setmarkObtain(o);
        s2.setmaxNo(t);	
        
        s2.details();
        System.out.print("\n");
    //   System.out.println(s2.getSubId());
        
        Subject sub[] = new Subject[3];
        
        sub[0] = new Subject("math101","adityaraj",100,87);
        sub[1] = new Subject("oops102","Adityaraj",100,90);
        sub[2] = new Subject("DSA103","Aadityaraj",100,98);
        
        for(Subject k:sub) {
        	k.details();
        	System.out.print("\n");
        	
        }
        m.close();
	}

}
