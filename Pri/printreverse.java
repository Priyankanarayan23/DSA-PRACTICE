
import java.util.*;
public class printreverse {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
		System.out.println("enter the digit");
        int n=scn.nextInt();
		System.out.println("enter the number");
		int d[]=new int[n];
        for(int i=0;i<n;i++){
           d[i]= scn.nextInt();
        }
    String ans="";
		for(int i=d.length-1;i>=0;i--){
			ans+=d[i]+"x";
		}
		System.out.print(ans);
    }
}
