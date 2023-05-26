import java.util.*;
public class subsetsumeasy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        String asf="";
        System.out.println(checkSum(arr,1,0, asf));

        }
        
    }
    public static boolean checkSum(int arr[], int ix , int sum, String asf) {
        if(asf.length()>0 && sum==0)return true;
        if(ix==arr.length)return false;
        return checkSum(arr, ix+1, sum+arr[ix],asf+arr[ix]+"")
        || checkSum(arr, ix+1, sum,asf);
        
    
    }
}
