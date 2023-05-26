
import java.util.*;
public class printeven {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int eve=2;
        while(eve<=n){
            System.out.print(eve+" ");
            eve+=2;
        }
    }
}