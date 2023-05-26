import java.util.*;

import javax.lang.model.util.ElementScanner6;
class pri{
    public static void main(String args[]) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter the no. you wanna find");
        int d=scn.nextInt();
       System.out.println("index: "+binarysearch(arr,d));
       System.out.println("The max element is: "+ max(arr));
       System.out.println(arr);
       


    }
    public static int binarysearch(int arr[], int d){
        int low=0,high=arr.length;
        while(low<=high){
            int mid= (low+high)/2;
            if(d>arr[mid]){
                low= mid+1;
            }
            else if(d<arr[mid]){
                 high=mid-1;
            }
            else {
                return mid;
            }
            
        }
        return -1;
    }
public static int linearsearch(int arr[],int d){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==d){
            return i;
        }
        
    }
    return -1;
}
    public static int max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}