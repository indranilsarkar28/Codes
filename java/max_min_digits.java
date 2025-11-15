
package tcs;
import java.util.Scanner;
public class max_min_digits {
    public static void main (String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sn.nextInt();
        int max = 0;
        int min=9;
        while(n>0){
            int r = n%10;
            if(max<r)
                max=r;
            if(min>r)
                min=r;
            n = n/10;
        }
        System.out.println("max:-"+max+",min:-"+min);
    }
}
