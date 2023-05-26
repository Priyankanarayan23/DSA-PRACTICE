import java.util.*;
public class recfirstindex{
    public static void main(String args[]) {
       Scanner scn=new Scanner(System.in);
	   int n=scn.nextInt();
	   int arr[]=new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
       }
       int m=scn.nextInt();
       System.out.println(firstindex(arr,m,0));
    }
    public static int firstindex(int arr[],int m,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==m){
            return i;
        }
       
      return firstindex(arr,m,i+1);
    }
}
