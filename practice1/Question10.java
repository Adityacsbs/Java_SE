/*Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7*/

//code starts here

import java.util.Scanner;  // Import the Scanner class
class Question10{
    public static void main(String[] args) {
     
     Scanner n = new Scanner(System.in);
     int a;int k =0;
     System.out.println("enter the number to print thier digits");
     a = n.nextInt();
     System.out.println("the number is "+ a);
     while(a>0){
         int b = a%10;
         k = b + k;
         a = a/10;
     }
       System.out.println("the sum of number is : "+ k);
     
    }
}
