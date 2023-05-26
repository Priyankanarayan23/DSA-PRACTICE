import java.util.*;
public class patterntri{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        prints(0,n);

    }
    public static void prints(int stars,int n){
        if(stars==n) return;
        for(int j=0;j<=stars;j++){
            System.out.print("*");
        }
        System.out.println(" ");
        prints(stars+1,n);
        
    }
}