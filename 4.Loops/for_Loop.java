import java.util.*;
public class for_Loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Print Square patter using user input
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();

        // for(int i=1; i<=num; i++){
        //     System.out.println("* * * * *");
        // }





        // Check if number is prime or not using user input
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        

        if(num == 2){
            System.out.println("Prime");
        }else{
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }


        }

        
    }
    
}
