import java.util.*;
public class fibbopattern {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int k=0;
        int m=1;
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
             if(k==0) System.out.print(k+ " ");
             System.out.print(k+m +" ");
             
             
            }
            System.out.println(" ");
        }
    }
}
