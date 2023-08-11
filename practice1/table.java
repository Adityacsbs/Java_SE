package practice;
import java.util.*;

class pr {
    // table of 5
    public void table1() {
        for (int i = 1, j = 5; i < 11; i++) {
            System.out.println(" " + j + " * " + i + " = " + (i * j));
        }
    }

    // table of any number
    public void table2(int j) {
        for (int i = 1; i < 11; i++) {
            System.out.println(" " + j + " * " + i + " = " + (i * j));
        }
    }
}

class sum {
    public void sumofN(int n) {
        int k = 0; // Initialize the sum variable outside the loop
        for (int i = 1; i <= n; i++) { // Change condition to i <= n
            k = k + i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + k);
    }
}

class factorial{
	
	public void fact(int n) {
		
		long m=1;
		for(int i=n;i>0;i--) {
			m=m*i;
			
		}
		System.out.println("factorial of " + n + "  is: " + m);
	}
}

public class table {
    public static void main(String[] args) {
        pr m = new pr();
        m.table1();

        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter the number for table: ");
        a = s.nextInt();
        m.table2(a);
       

        sum j = new sum();
        
        int b;
        System.out.println("Enter the number for sum: ");
        b = s.nextInt();
        j.sumofN(b);
        
        factorial f = new factorial();
        int c;
        System.out.println("Enter the number for fact: ");
        c = s.nextInt();
        f.fact(c);
        
        s.close();
    }
}
