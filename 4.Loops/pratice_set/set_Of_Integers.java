package pratice_set;
import java.util.*;
public class set_Of_Integers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int num;
        int choice;
        int even_sum = 0;
        int odd_sum = 0;

        do{
            System.out.print("Enter the number: ");
            num = sc.nextInt();

            if(num % 2 == 0){
                even_sum = even_sum + num;
            }
            else{
                odd_sum += num;
            }
            System.out.print("For Continue Press 1 / For Exit Press 0: ");
            choice = sc.nextInt();
           
        }while(choice == 1);

        System.out.println("Sum of Even number: " + even_sum);
        System.out.println("Sum of Odd number: " + odd_sum);
         
    }
    
}
