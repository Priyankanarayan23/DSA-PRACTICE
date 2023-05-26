import java.util.*;
public class twosum {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=scn.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
    System.out.println("Enter the target element");
      int target=scn.nextInt();
      int ans[]=twoSum(arr,target);
      for(int i:ans)System.out.print(i+" ");
      

    }
    public static int[] twoSum(int arr[],int target){
        int arr1[] = new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]== target){
                arr1[0]=i;
                arr1[1]=j;
            }
            }
        }
        return arr1;
    }
}
