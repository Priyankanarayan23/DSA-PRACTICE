import java.util.*;
public class Besttimetobuystocks {
    public static void main(String[] args) {
        
        System.out.println("Enter the length of array");
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ans=maxprofit(arr);
       System.out.println("Max profit:"+ ans);
    }
    public static int maxprofit(int arr[]) {
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
         if(min>arr[i]) min=arr[i];
         if(arr[i]-min>profit) profit=arr[i]-min;

        }
        return profit;
        
    }
}
