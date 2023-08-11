package practice;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a,b;
		System.out.println("enter the number hor loops :");
		a = s.nextInt();
		b= s.nextInt();
		
		for(int i = 0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(j>=i) {
					System.out.format("*");
				}else {
					System.out.format(" ");
				}
			}
			System.out.println("");
		}
		
		for(int i =0;i<a;i++) {
			m++;
			int m=0;
			for(int j = 1;j<=b;j++) {
				
				if(j<b-m) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
				}
							
			}
			System.out.println("");
		}
		s.close();

	}

}
