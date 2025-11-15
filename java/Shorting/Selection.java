package Shorting;
public class Selection {
    public static void main(String[] args) {
        int num []={8,6,9,2,4,5,90,5};
        int temp;
         int length= num.length;
         int minindex=-1;
         int count=0;
        System.out.println("Before shorting");
        for(int n : num){
            System.out.print(n + " ");
        }
        for(int i=0 ; i<length-1 ; i++){
            minindex=i;
            for(int j=i+1 ; j<length ; j++){
                if(num[j]<num[minindex]){
                    minindex=j;
                }
            }
            temp=num[i];
            num[i]=num[minindex];
            num[minindex]=temp;        
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
