package pratice_set;
import java.util.*;
public class multiplication_Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        int num = sc.nextInt();
        int multiple = 0; 
        for(int i=1; i<=10; i++){
            multiple = num * i;
            System.out.println(num + " * " + i + " = " + multiple);
        }
    }
    
}
