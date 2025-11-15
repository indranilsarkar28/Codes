
package recurtion;
import java.util.Scanner;

public class recurtion {
   public static void fact(int num) {
       System.out.println(num);
       if(num!=0)
       fact(num - 1);
    }
    public static void main (String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Give the limit");
        int num = sn.nextInt();
        System.out.println("Factoral");
        fact(num);
        
    }
}
