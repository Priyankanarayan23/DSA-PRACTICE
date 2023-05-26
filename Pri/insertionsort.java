import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the length of array:");
        int m=scn.nextInt();
        int arr[]= new int[m];
        System.out.println("enter the array:");
        for(int i=0;i<arr.length;i++){
          arr[i]=scn.nextInt();
        }   
 insertion(arr);    
 for(int i :arr){
    System.out.print(i +" ");
}
    }
public static void insertion(int arr[]){
    for(int i=1;i<=arr.length-1;i++){
        int puc=arr[i];
        int j;
        for( j=i-1;j>=0 && arr[j]>puc;j--){
arr[j+1]=arr[j];
        }
        arr[j+1]=puc;
    }
}
}    
    

