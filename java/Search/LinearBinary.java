package Search;

public class LinearBinary {
public static void main(String[] args) {
 int num []= {2,8,6,5,3,80,133};
    int target = 133;
    int result1 = LinearSearch(num,target);
    int result2 = BinarySearch(num,target);
    int result3 = ReBinarySearch(num,target,0,num.length-1); 
    if(result1!=-1)
        System.out.println("Element founs index no(linear):"+result1);
    else
            System.out.println("No element found");
    
    
    if(result2!=-1)
        System.out.println("Element founs index no(binary):"+result2);
    else
            System.out.println("No element found");
    
    if(result3!=-1)
        System.out.println("Element founs index no(Rebinary):"+result3);
    else
            System.out.println("No element found");
}
    
    
     
    public static int LinearSearch(int[] num, int target) {
       int count = 0 ;
       int n = num.length;
       for(int i = 0 ; i<=n-1 ; i++){
           count++;
           if(num[i]==target){
               System.out.println("Linear count = "+count);
               return i;
           }
              
       }
       System.out.println("Linear count = "+count);
       return -1;  
    }
    
    public static int BinarySearch(int[] num, int target) {
       int count = 0;
       int right = num.length-1;
       int left = 0;
       while(left<=right){
           int mid=(left+right)/2;
//           System.out.println("LEFT="+num[left]);
//           System.out.println("MID="+num[mid]);
//           System.out.println("RIGHT="+num[right]);
           if(num[mid]==target){
               System.out.println("Binary count = " + count);
               return mid;
           }else if(num[mid]<target){
               left=mid+1;
               count++;
           }else if(num[mid]>target){
               right=mid-1;
               count++;
           }
       }
       System.out.println("Binary count = " + count);
       return -1;  
    }
    
    
    
    
    static int count = 0 ;
    public static int ReBinarySearch(int[] num, int target,int left,int right) {
       if(left<=right){
           int mid=(left+right)/2;
           if(num[mid]==target){
               System.out.println("ReBinary count = " + count);
               return mid;
           }else if(num[mid]<target){
               count++;
               return ReBinarySearch(num, target,mid+1,right);
           }else if(num[mid]>target){
                count++;
               return ReBinarySearch(num, target,left,mid-11);
           }
       }
       System.out.println("ReBinary count = " + count);
       return -1;  
    }
    
}



