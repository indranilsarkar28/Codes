package tcs;
public class Range_palindrom {
    public static void main(String [] args){
     int x = 0;
     int y = 2000;
     int z ;
     for(int i = x ; i<=y ; i++){
         int n = i;
         int sum = 0;
         while(n!=0){
            z = n % 10;
            sum = (sum * 10)+ z;
            n /=10;
        }
         if(i==sum){
             System.out.println(i);
         }
     }
    }
    
}
