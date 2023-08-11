package practice;
import java.util.*;
class series{
	
	public void AP(int a,int d,int t) {
		int k = a;
		for(int i=0;i<t;i++) {
			System.out.print(" "+k+" ");
			 k= k + d;
		}
	}
	
	public void GP(int a,int r,int t) {
		
		int g=a;
		
		for(int i=0;i<t;i++) {
			System.out.print(g+" ");
			g = g*r;
		}
	}
}

public class Question3 {

	public static void main(String[] args) {
	 Scanner S=new Scanner(System.in);	
		series s = new series();
		
		System.out.println("AP series ");

		System.out.println("enter the first digit : ");
		int a = S.nextInt();
		System.out.println("enter the common differnce : ");
		int d =S.nextInt() ;
		System.out.println("enter the number of terms : ");
		int t = S.nextInt()	;
		
		s.AP(a, d, t);
		
		System.out.println(" \nGP series ");
		
		System.out.println("enter the first digit : ");
		
		int a1 = S.nextInt();
		
		System.out.println("enter the common differnce : ");
		
		int d1 =S.nextInt() ;
		
		System.out.println("enter the number of terms : ");
		
		int t1 = S.nextInt();
		
		s.GP(a1, d1, t1);
		
		S.close();
	
	}

}
