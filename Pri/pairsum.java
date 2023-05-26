import java.util.*;
public class pairsum {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();


        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==target && i!=j){
                    System.out.println("the indexes are: "+i+" "+j);
                   
                }
            }
        }
    }
}
