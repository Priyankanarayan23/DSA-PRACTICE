import java.util.*;

public class ninjaandsortedarray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the length of arr1:");
        int m=scn.nextInt();
        System.out.println("Enter the length of arr2:");
        int n=scn.nextInt();
        int arr1[]=new int[m+n];
        int arr2[]=new int[n];
        System.out.println("Enter the elements of arr1:");
        for(int i=0;i<m;i++){
            arr1[i]=scn.nextInt();
        }
        System.out.println("Enter the elements of arr2:");
        for(int i=0;i<n;i++){
            arr2[i]=scn.nextInt();
        }
    }
   
}
