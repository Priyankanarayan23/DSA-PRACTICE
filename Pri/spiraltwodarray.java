import java.util.*;

public class spiraltwodarray {
    public static void main(String[] args) {
        int arr[][]= new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    int top=0,right=arr[0].length,bottom=arr.length,left=0;
    int ix=0,size=arr.length*arr[0].length;
  
    while(ix<size){
        for(int j=left;j<right;j++ ){
            System.out.print(arr[top][j]+" ");
            ix++;
        }
        top++;
        for(int i=top;i<bottom;i++){
            System.out.print(arr[i][right-1]+" ");
            ix++;
        }
        right--;

        for(int j=right-1;j>=left;j-- ){
            System.out.print(arr[bottom-1][j]+" ");
            ix++;
        }
        bottom--;
        
        for(int i=bottom-1;i>=top;i-- ){
            System.out.print(arr[i][left]+" ");
            ix++;
        }
        left++;
    }
    
    }
}
