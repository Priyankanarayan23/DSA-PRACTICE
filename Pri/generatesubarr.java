import java.util.*;
public class generatesubarr {
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
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
            System.out.println();
            }
        }
    }
}
