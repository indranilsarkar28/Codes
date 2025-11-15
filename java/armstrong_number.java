package tcs;
import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sn.nextInt();
        int len = String.valueOf(n).length();
//        System.out.println(len);
        int num = n;
        int sum=0;
        while(num>0){
           int temp = num%10;
           sum += Math.pow(temp,len);
           num/=10;
        }
        if(sum==n)
            System.out.println("Yes Armstrong number");
        else
            System.out.println("No Armstrong number");
    }
}
