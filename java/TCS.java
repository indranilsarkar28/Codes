
package tcs;

public class TCS {
     public static void main(String[] args){
        int n = 1002 ;
        int m = n;
        int sum=0;
        int x ;
        while(m!=0){
            x = m % 10;
            sum = (sum * 10)+ x;
            m /=10;
        }
         System.out.println(sum);

    }
    
}
