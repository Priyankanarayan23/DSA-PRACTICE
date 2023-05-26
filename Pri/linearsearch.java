import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();

        }
        int val=scn.nextInt();
     System.out.println(linearsear(arr,val)); }

public static int linearsear(int arr[],int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
            
            }
            return -1;
        }
    }
   

