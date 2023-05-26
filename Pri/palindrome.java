import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the word");
        String s=scn.nextLine();
        String r=revs(s);
        System.out.println(r);
        if(s.equals(r)){
            System.out.println("matched");
        }
        else   System.out.println("does not matched");
     
    }
    public static String revs (String s){
String ans="";
for(int i=s.length()-1;i>=0;i--){
ans+=s.charAt(i)+"";
}
return ans;
    }
}
