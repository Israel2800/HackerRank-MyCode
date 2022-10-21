// Using printf

package Java;
import java.util.*;
public class OutPut_Formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                // %s is used to format strings of characters
                // %d is used to format decimal numbers in base 10
                // %n is used to add a new line character
                System.out.printf("%-14s %03d\n", s1, x);
            }
            System.out.println("================================");
    }
}
