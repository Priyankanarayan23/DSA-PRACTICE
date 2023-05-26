import java.util.*;
public class replacezerowfive {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String st=scn.nextLine();
        StringBuilder bb=new StringBuilder(st);
        ;
        System.out.println(st.replaceAll("0", "5"));
    }
}
