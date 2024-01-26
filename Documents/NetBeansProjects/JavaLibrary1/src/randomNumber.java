import java.util.*;

public class randomNumber {

    public static void main(String[] args) {
        System.out.println("You have 10 chances:");
        System.out.println("Enter the number:");

        try (Scanner input = new Scanner(System.in)) {
            int num;
            int random = (int) (Math.random() * 101);
            int n = 10;
            
            while (n > 0) {
                num = input.nextInt();
                
                if (num < random) {
                    System.out.println("Smaller than the random number");
                } else if (num > random) {
                    System.out.println("Greater than the random number");
                } else if (num == random) {
                    System.out.println("You guessed it correctly!");
                    break;
                }
                
                n--;
                System.out.println("Chances remaining: " + n);
            }
            if(n==0){
                System.out.println("you failed");
            }
            System.out.println("your score is :" + n);
            
        }
    }
}
