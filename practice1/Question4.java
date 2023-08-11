package practice;
import java.util.*;

class pat1 {
	
	public void p1(int a,int b) {
		
		for(int i=0;i<a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
	}
  public void p2(int a,int b) {
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		
	}
  
  public void p3(int a,int b) {
		
		for(int i=1;i<=a;i++) {
			for(int j=i;j<b+i;j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print((i+j)+" ");
			}
			System.out.println("");
		}
		
	}
  public void p4(int a,int b) {
		
	  int count =0;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				++count;
				System.out.format(" %02d",count);
			}
			System.out.println("");
		}
		
  
     int count2 =0;
	for(int i=1;i<=a;i++) {
		++count2;
		for(int j=1;j<=b;j++) {
			System.out.print(count2+" ");
		}
		System.out.println("");
	}
	}
	
}

public class Question4 {

	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
		pat1 p = new pat1();
		
		int m,n;
		System.out.println("enter the numbers : ");
		m=S.nextInt();
		n=S.nextInt();
		
		
		p.p1(m , n);
		
		int m1,n1;
		System.out.println("enter the numbers : ");
		m1=S.nextInt();
		n1=S.nextInt();
		p.p2(m1, n1);
		
		int m2,n2;
		System.out.println("enter the numbers : ");
		m2=S.nextInt();
		n2=S.nextInt();
		p.p3(m2, n2);
		
		int m3,n3;
		System.out.println("enter the numbers : ");
		m3=S.nextInt();
		n3=S.nextInt();
		p.p4(m3, n3);
		
		
		S.close();

	}

}
