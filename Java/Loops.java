// For loop

package Java;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = scan.nextInt();

        /* Using for loop initializing i with 1, minor or equals to 10 and it will be increasing
        one by one. When it's printed we will just use the same variables to use the multiplication
        operation */ 
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" * "+i+" = "+num*1);
        }
    }
}
