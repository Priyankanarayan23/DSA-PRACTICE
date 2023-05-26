import java.util.*;
public class wavetwodarray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the rows and columns of 2D array:");
        int [][]arr=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println(" ");
            }
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}
