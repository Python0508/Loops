package pratice_set;
import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int factorial = 1;

        for(int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of given number: " + factorial);
    }
    
}
