import java.util.*;
public class sumeqzero {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("length of the array: ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }  
        System.out.println(sub(arr));   
        }
        public static boolean sub(int arr[]){
            for(int i=0;i<arr.length;i++){
                int flag=0;
                for(int j=1;j<arr.length;j++){
                    if(arr[i]+arr[j]==0){
                        flag=1;
                    }
                }
                if(flag>0){
                    return true;
                }
                
        }
        return false;
    }
}
