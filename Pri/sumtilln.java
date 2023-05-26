import java.util.*;
public class sumtilln {
    
        public static void main(String[] args) {
            Scanner scn=new Scanner(System.in);
            System.out.println("length of array: ");
        int n =scn.nextInt();  
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter the elements of arrays: ");
        for(int i=0;i<arr.length;i++){ //taking elements
            arr[i]=scn.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum; //calc sum
        }
        System.out.println("sum: "+sum);
        System.out.println("average: "+sum/2);
}
}
