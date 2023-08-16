package practice;
import java.util.*;

class start{
	
	public void a() {
		System.out.println("Hello Aadityaraj singh chouhan");
		double a=23,b=21;
		double c =a/b;
		System.out.println("the sum is :  " + (a+b));
		System.out.println("the sum is :  " + c );
		
	}
	
	public void b() {
		
		Scanner s =new Scanner(System.in);
		double a,b;
		
		System.out.print("enter the number a :");
		a = s.nextDouble();
	    System.out.print("\nenter the number b : ");
	    b = s.nextDouble();
	    
	    System.out.println("\n-----------------------------------");

	    
	    System.out.println("the product of two number is :- " + (a*b));
	    System.out.println("the divide of two number is :- " + (a/b));
	    System.out.println("the sum of two number is :- " + (a+b));
	    System.out.println("the sub of two number is :- " + (a-b));    		
	    System.out.println("the mod of two number is :- " + (a%b));
	    
	    System.out.println("-----------------------------------");

	    double c = (a * b - b * b ) / (a  - b);
	    System.out.println(c + " type example ");
	    
	    
	    
	    System.out.println("-----------------------------------");
	    System.out.println("The table of a and b is here : ");
	    
	    System.out.println("The table of a is here first : ");
	    for(int i =1 ;i<11;i++) {
	    	System.out.println(a + "*" + i + "=" +(a*i));
	    }
	    
	    System.out.println("--------------------------------");
	    System.out.println("The table of b is here first : ");
	    for(int i =1 ;i<11;i++) {
	    	System.out.println(b + "*" + i + "=" +(b*i));
	    }
	}
	
	public void c() {
		 System.out.println("-----------------------------------");
		
	
		  System.out.println("   J    a   v     v  a ");
	        System.out.println("   J   a a   v   v  a a");
	        System.out.println("J  J  aaaaa   V V  aaaaa");
	        System.out.println(" JJ  a     a   V  a     a");
		 
	}
	public void d() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total number of values for finding avg : ");
		int a;
		int count =0;
		double k;
		double m=0;
		a = s.nextInt();
		
		for(int i = 1 ; i <= a ; i++) {
			
		 System.out.print("enter the "+ i +" number for avg :- ");	
		 k =  s.nextDouble();
		 m =m+k;
		 count++;	
			
		}
	 System.out.println("avg of given number is : " + (m/count));	
	 s.close();
	}
	
	public void amrikaa() {
		
		
		
		System.out.println("\n\n\n-----------------------------------\n\n\n");
		
		
		
		    System.out.println("* * * * * * ==================================");
	        System.out.println(" * * * * *  ==================================");
	        System.out.println("* * * * * * ==================================");
	        System.out.println(" * * * * *  ==================================");
	        System.out.println("* * * * * * ==================================");
	        System.out.println(" * * * * *  ==================================");
	        System.out.println("* * * * * * ==================================");
	        System.out.println(" * * * * *  ==================================");
	        System.out.println("* * * * * * ==================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	}
	
	public void swappp() {
	System.out.println("-----------------------------------");
	int a=5,b=7;
	int c =a;
	a = b;
	b =c;
	System.out.println("a "+ a);
	System.out.println("b "+ b);
	
	
	
	}
	
}

public class Question8 {

	public static void main(String[] args) {
		
		start m=new start();
		
	//	m.a();
		//m.b();
//		m.c();
	//	m.d();
		m.amrikaa();
		m.swappp();

	}

}
