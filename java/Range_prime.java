package tcs;
import java.util.Scanner;
//import java.lang.Math;
public class Range_prime {
    public static void main (String[] args){
        Scanner sn = new Scanner (System.in);
        System.out.println("MIn range :");
        int min = sn.nextInt();
        System.out.println("Max range :");
        int max = sn.nextInt();
        int check = 0 ;
//        for(int i = min ; i<=max ; i++){
//             if(i==1)
//                    continue;
//            int count=2;
//            int n = i;
//            for(int j =2 ; j<=(int)Math.sqrt(n) ; j++){
//                if(n%j==0){
//                    count++;
//                }
//                while(n%j==0){
//                    n=n/j;
////                    System.out.println("n:"+n);
//                }
//                check++;
//            }
//            if(count==2)
//                System.out.println(i);
//            check++;
//        }
//        System.out.println("check:"+check);
            for(int i = min ;i<=max ;i++){
                int count=0;
                for(int j= 1 ; j<=i ; j++){
                if(i%j==0)
                    count++;
                check++;
                }
                if(count==2)
                    System.out.println(i);
                check++;
            }
            System.out.println("check :"+check);
        }
}
