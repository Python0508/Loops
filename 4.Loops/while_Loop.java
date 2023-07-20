import java.util.*;
public class while_Loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //print hello world 100 times using user input
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // int counter = 1;

        // while(counter <= num){
        //     System.out.println(counter + ". Hello World");
        //     counter++;
        // }



        // print numbers from 1 to n using user input
        // System.out.print("Enter the number: ");
        // int range = sc.nextInt();
        // int counter = 1;

        // while(counter <= range){
        //     System.out.print(counter + " ");
        //     counter++;
        // }


        //Print sum of first n natural numbers
        // System.out.print("Enter the Number: ");
        // int num = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        
        // while(i <= num){
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println("Sum of natural numbers: " + sum);



        // Print reverse of a given number using user input
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverse = 0 ;

        while(num > 0){
            int last_Digit = num % 10;
            reverse = (reverse * 10) + last_Digit;
            num /= 10;
        }
        System.out.println("Reverse of given number: " + reverse);

    }
    
}
