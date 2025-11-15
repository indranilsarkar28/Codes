
package tcs;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sn = new Scanner (System.in);
        System.out.println("Enter the range : ");
        int n = sn.nextInt();
        long facto = 1 ;
        
        for(int i = 1 ; i<=5 ; i++){
            long f = facto;
            facto*=i;
            System.out.println(f+"*"+i+"="+facto);
        }
        
    }
}
