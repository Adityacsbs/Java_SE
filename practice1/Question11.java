/*Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT*/


import java.util.Scanner;
class Question11 {
    public static void main(String[] args) {

  
  Scanner s =new Scanner(System.in);
  
  System.out.println("enter the string ");
  
  char[] str = s.nextLine().toCharArray();
  
  for(int i = str.length-1;i>=0;i--){
      System.out.print(str[i]);
  }
  System.out.println("\n");
  
    }
}