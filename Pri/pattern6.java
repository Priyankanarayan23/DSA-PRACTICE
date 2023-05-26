import java.util.*;

public class pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        boolean inc =true;
        int st=(n/2)+1;
        int sp=1;
        for(int i=1;i<=n;i++){
            if(inc){
                for(int j=1;j<=st;j++){
                    System.out.print("*"+"  ");
                }   
                for(int j=1;j<=sp;j++){
                    System.out.print("   ");
                }
                for(int j=1;j<=st;j++){
                    System.out.print("* "+"  ");
                }
                sp+=2;
                st--;
                if(st<1){
                    inc=false;
                    sp-=4;
                    st+=2;
                }
            }else{
                for(int j=1;j<=st;j++){
                    System.out.print("* "+"  ");
                }
                for(int j=1;j<=sp;j++){
                    System.out.print("   ");
                }
                for(int j=1;j<=st;j++){
                    System.out.print("* "+"  ");
                }
                sp-=2;
                st++;
                
            }
            System.out.println();
        }

    }
}