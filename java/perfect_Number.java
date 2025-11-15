
package tcs;
import java.util.Scanner;
public class perfect_Number {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        int n = (int)Math.sqrt(num);
        int sum = 1;
        for(int i = 1 ; i<=n ;i++){
            if(num%i==0){
                sum+=i;
                if(i!=num/i )
                    sum+=num/i;
            }
        }
        System.out.println(sum);
        
    }
}
