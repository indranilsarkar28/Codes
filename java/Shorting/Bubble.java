package Shorting;
public class Bubble {
    public static void main(String[] args) {
        int num []={8,6,9,2,4,5,90,5};
        int temp;
         int length= num.length;
         int count=0;
        System.out.println("Before shorting");
        for(int n : num){
            System.out.print(n + " ");
        }
        for(int i=0;i<length;i++){
            for(int j = 0 ;j<length-i-1;j++){
                if(num[j]>num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
                count++;
            }
        }
        System.out.println(" ");
        System.out.println("After shorting");
        for(int n : num){
            System.out.print(n + " ");
        }
        System.out.println(" ");
        System.out.println("Total count:"+count);
    }
}
