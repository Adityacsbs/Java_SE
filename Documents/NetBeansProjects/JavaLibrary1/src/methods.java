import java.util.*;
public class methods {
    static void m1(){
        System.out.println("hello this is method : ");
    }
    static int m2(int n){
        return 23+n;
    }
    static double m2(double m){
        return m*22;
    }
    static void m3(){
        System.out.println("enter the input :");
        Scanner  s = new Scanner(System.in);
        
        int m = s.nextInt();
        for(int i = 0;i<m;i++){
            System.out.println("The number is hehehe  : "+ i);
            String jj = s.nextLine();
            System.out.println("hehehehe koi baat nhi hota hai hehehe " + jj);
        }
        
    }
    public static void main(String[]  args){
        m1();
     int x =   m2(4);
     System.out.println(x);
     double y =   m2(4.23);
     System.out.println(y);
     
     m3();
       
    }
    
}
