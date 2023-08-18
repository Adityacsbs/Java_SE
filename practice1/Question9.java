package practice;
//import java.util.*;
import java.util.Scanner;

class k{
	
	public void a1() {
		
		System.out.println("        +\"\"\"\"\"+");
		System.out.println("       [| o o |]");
		System.out.println("        |  ^  | ");
		System.out.println("        | '-' | ");
		System.out.println("        +-----+");
	}


public void Add_two_binary_numbers() {
	
	long b1,b2;
	
	int i = 0, rem = 0;
	
	int[] sum = new int[20];
	
	Scanner s=new Scanner(System.in);
	
	System.out.print("enter first binary number : ");
	b1 = s.nextLong();
	System.out.print("enter second binary number : ");
	b2 = s.nextLong();
	
	while(b1!=0 || b2 !=0)
	{
	sum[i++] = (int)((b1%10 + b2%10 + rem)%2);	
	rem =(int )((b1%10 + b2%10 + rem)/2);	
	b1 = b1/10;
	b2 =  b2/10;
	
	if(rem!=0) {
		sum[i++]=rem;
		
	}
	--i;
	
	System.out.print("Sum of two binary numbers: ");
	  while (i >= 0) {
	   System.out.print(sum[i--]);
	  }
	   System.out.print("\n");  
	 }
		
	
	
	s.close();
}

}

public class Question9 {

	public static void main(String[] args) {
		
		k m=new k();
		
		m.a1();
		m.Add_two_binary_numbers();
		

	}

}
