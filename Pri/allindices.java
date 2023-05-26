import java.util.*;
public class allindices{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
         arr[i]=scn.nextInt();
        }  
        int target=scn.nextInt();
         List<Integer> list=new ArrayList<>();
         allindex(arr,target,0,list);
         for(int i: list)System.out.print(i+" ");
         System.out.println();
     }
     public static void allindex(int arr[],int target,int i, List<Integer> list){
          if(i==arr.length) return;
          if(arr[i]==target){
             list.add(i);
          }
          allindex(arr,target,i+1,list);
    }
    

}