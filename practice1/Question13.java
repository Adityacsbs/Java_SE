/* Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output

123                                                      
124                                                      
...                                            
                                                   
431                                                      
432                                                      
Total number of the three-digit-number is 24
*/

//code is here

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
    int count =0;
    for(int i =1;i<=4;i++){
        for(int j=1;j<=4;j++){
            for(int k= 1; k<=4;k++){
                if(i!=j && j!=k && i!=k){
                System.out.print(i+""+j+""+k+",");
                count++;
                }
                    
            }
        }
    }
    System.out.println("");
    System.out.println("\n"+count);

    }
}