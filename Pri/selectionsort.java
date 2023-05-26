import java.util.*;
public class selectionsort {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){ 
            int min=Integer.MAX_VALUE;
            int temp=0;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<min){
                    min=arr[j];
                 }
                    temp=arr[i];
                    arr[i]=min;
                    arr[j]=temp;
                    temp=0;
                 }}
            

for(int i:arr){
    System.out.print(i+" ");
} 
}}
