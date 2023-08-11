package practice;
import java.util.*;
class test{
	
	public void display(int n) {
		int count =0;
		while(n>0) {
			int r = n%10;
			n=n/10;
			System.out.println(r);
			count++;
		}
		System.out.println("no of digits "+ count);
		
	}
	
	public void amstrng(int n) {
		int count =0;
		int m=n;
		while(n>0) {
			
			int r =n%10;
			n =n/10;
			count = count + (r*r*r);
			
		}
		System.out.println("amstrong  is "+ count);
		if(m==count) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}
	public void reverse(int n) {
		int s=0;
		while(n>0) {
			int r= n%10;
			n=n/10;
			s=s*10;
			s=s+r;
		}
		System.out.println(s);
	}
	
	public void palindrome(int n) {
		int m=n;
	
		int s=0;
		while(n>0) {
			int r= n%10;
			n=n/10;
			s=s*10;
			s=s+r;
	}
	if(s==m) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
		
	
	}
		
}
public class Question2 {

	public static void main(String[] args) {
		
		
       Scanner s =new Scanner(System.in);
		test t= new test();
		
		System.out.println("enter the number");
		int a =s.nextInt();
		
		t.display(a);
		
		
		System.out.println("enter the number");
		int b =s.nextInt();
		
		t.amstrng(b);
		
		System.out.println("enter the number");
		int c =s.nextInt();
		
		t.reverse(c);
		
		System.out.println("enter the number");
		int d =s.nextInt();
		
		t.palindrome(d);
		s.close();
		
		
	}

}
