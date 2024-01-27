import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        System.out.println("hello we are here to learn about an array in java ");
        
        try (Scanner scanner = new Scanner(System.in)) {
           String inputString = scanner.nextLine();
            int n = scanner.nextInt();
          
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
               array[0]=12;
               System.out.println("length of array is : "+array.length);
            for (int num : array) {
                System.out.println("numbers are: " + num);
            }
          
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }

            System.out.println("hello, another Scanner function is used :");
          
            String originalString = "AAdityaraj Singh Chouhan";
            System.out.println(originalString + inputString);
            
           
            System.out.println("MUltidimentional array :");
            String[][] data = {{"Adityaraj","dewas","new"},{"Raviraj","indore","old"}};
            
            for (String[] data1 : data) {
               for (String data11 : data1) {
                   System.out.print(data11 + " ");
               }
                System.out.println(" ");
            }
        }
    }
}
