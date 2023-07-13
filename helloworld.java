package codes;
import java.util.*;

public class helloworld{

     public static void main(String[] args) {

        System.out.println("first code in java ");

        Scanner  m =new Scanner(System.in);

        int a,b,c;
        System.out.println("entr your name bro:-");

        String d = m.nextLine();
        System.out.println("enter all the entries of number for sum");

        a =m.nextInt();
        b= m.nextInt();
        c = a+b;

        System.out.println("the sum of two numbers are :- "+ d+" " + c);
        m.close();
    }
}
