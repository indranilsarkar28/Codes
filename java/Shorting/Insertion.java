package Shorting;
public class Insertion {
    public static void main(String[] args) {
        int num []={9,8,7,6,5,4,3,2,1}; 
        int key;
        int j;
        System.out.println("Befor short");
        for(int n : num){
            System.out.print(n+" ");
        }
        for(int i = 1 ; i<num.length ; i++){
            key=num[i];
            j=i-1;
            while(j>=0 && num[j]>key  ){
                num[j+1]=num[j];
                j=j-1;
            }
            num[j+1]=key;
        }
        System.out.println(" ");
        System.out.println("After short");
        for(int n : num){
            System.out.print(n+" ");
        }
        
    }
}

