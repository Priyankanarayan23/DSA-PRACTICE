import java.util.*;
public class largestofn{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int n =scn.nextInt();
        int arr[]=new int[n];
        int largest=Integer.MIN_VALUE;
        System.out.println("enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
       for(int i=0;i<arr.length;i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
       }
       System.out.println("Largest :"+largest);
    }}