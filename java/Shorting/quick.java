
package Shorting;
public class quick {
    public static void swap(int[] arr , int i , int  j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr , int low , int high){
        int i = low-1;
        int pi = arr[high];
        for(int j = low ; j<=high; j++){
            if(arr[j]< pi){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,high,i+1);
        return i+1;
    }
    public static void quickshort (int[] arr , int low , int high){
        if(low<high){
            int pi = partition(arr,low,high);
          quickshort(arr,low,pi-1);
          quickshort(arr,pi+1,high);
        }
    }
     public static void main(String[] args) {
        int num []={8,6,9,2,4,5,90,5};
        System.out.println("Before shorting");
        for(int n : num){
            System.out.print(n + " ");
        }
        
        quickshort(num,0,num.length-1);
        
         System.out.println(" ");
        System.out.println("After shorting");
        for(int n : num){
            System.out.print(n + " ");
        }
    
     }
}
