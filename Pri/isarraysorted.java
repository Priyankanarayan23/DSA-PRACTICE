import java.util.*;
public class isarraysorted{
    public static void main(String args[]) {
       Scanner scn=new Scanner(System.in);
	   int n=scn.nextInt();
	   int arr[]=new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
       
       }
       System.out.println(arraysorted(arr,0));   
    }
    public static boolean arraysorted(int arr[],int i){
      if(i==arr.length-1) return true;
      if(arr[i]>arr[i+1])  return false;
      return arraysorted(arr,i+1);
    }
}
