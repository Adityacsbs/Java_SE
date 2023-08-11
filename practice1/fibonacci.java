package practice;
import java.util.*;

class fibo{
	
	public void f(int n ) {
		int a=0;
		int b=1;
		int c;
		System.out.print(a + " , "+ b+"");
		for(int i=0;i<n-2;i++) {
			
			c = a + b;
			System.out.print(" , " + c );
			a  = b;
			b = c;
		}
	}
}

public class fibonacci {
	
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		
		int n;
		
		System.out.print("enter the n :");
		
		n = S.nextInt();
		
		fibo f=new fibo();
		
		f.f(n);
		
		S.close();
		
		
	}

}
