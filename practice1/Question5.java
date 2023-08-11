package practice;
import java.util.Scanner;

class Q5{
	
public void p1(int a,int b) {
		
		for(int i=0;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}
public void p2(int a,int b) {
	int count=0;
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i;j++) {
			count++;
			System.out.format("%02d ",count);
		}
		System.out.println("");
	}
	
}

public void p3(int a,int b) {
	
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=b-i+1;j++) {
			
			System.out.print(j+" ");
		}
		System.out.println("");
	}
	
}
}

public class Question5 {

	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
		Q5 p = new Q5();
		
		int m,n;
		System.out.println("enter the numbers : ");
		m=S.nextInt();
		n=S.nextInt();
		p.p1(m , n);
		
		int m1,n1;
		System.out.println("enter the numbers : ");
		m1=S.nextInt();
		n1=S.nextInt();
		p.p2(m1 , n1);
		
		int m2,n2;
		System.out.println("enter the numbers : ");
		m2=S.nextInt();
		n2=S.nextInt();
		p.p3(m2 , n2);
		
		
		
		S.close();
		
	}

}
