
package tcs;
import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter your range");
        int n = sn.nextInt();
        int a=0,b=1;
        for(int i = 0 ; i<=n-1 ; i++){
            a= a+b;
            b=a-b;
            System.out.print(b+",");
        }
                
    }
}
