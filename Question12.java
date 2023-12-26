 Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6

//code is here

import java.util.Scanner;

class Question12 {
    public static void main(String[] args) {
       
       Scanner S = new Scanner(System.in);
       
       String str ;
       
       str = S.nextLine();
       
       call(str);
    }
       
       public static void call(String a){
           
           char [] ok = a.toCharArray();
           int letter =0;
           int s= 0;
           int num = 0;
           int oth = 0;
           
           for(int i =0;i<a.length();i++){
               
               if(Character.isLetter(ok[i])){
                   letter++;
               }
               else if(Character.isDigit(ok[i])){
                   num++;
               }else if(Character.isSpaceChar(ok[i])){
                   s++;
               }else{
                   oth++;
               }
               
           }
           System.out.println("number of letters :-  "+letter);
            System.out.println("number of numner  "+ num);
             System.out.println("number of space  "+ s);
              System.out.println("number of oth "+ oth);
       }
    
        
        
    
}
