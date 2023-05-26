import java.util.*;
public class replacepiarray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
		  int t=scn.nextInt();
		  while(t-->0){
			String st=scn.next();
        StringBuilder bb=new StringBuilder(st);
        System.out.println(st.replaceAll("pi", "3.14"));
		  }
    }}
