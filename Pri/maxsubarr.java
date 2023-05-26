import java.util.*;
public class maxsubarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        generate(arr);
    }
    public static void generate(int arr[]){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                
                 sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                   sum+=arr[k];
                }
                 maxi= Math.max( maxi,sum);
            System.out.println();
         
            }
        }
        System.out.println("maximum"+ maxi);
    }
}
