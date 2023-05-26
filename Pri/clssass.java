import java.util.*;
public class clssass {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int t=scn.nextInt();
    while(t-->0){
        int n=scn.nextInt();
      int ans=getCount("",n,0);
      System.out.println(ans);
    }
}   
public static int getCount(String s,int n,int ans){
    if(s.length()==n) if(s.indexOf("bb")==-1) return 1;
    if(s.length()>n)return 0;
    return getCount(s+"a",n,ans)+getCount(s+"b",n,ans);
} 
}
