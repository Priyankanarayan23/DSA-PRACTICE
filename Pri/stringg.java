import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class stringg {
    public static void main(String[] args) {
        String st="hello";
        String str=" world";
        Scanner scn=new Scanner(System.in);
        System.out.println(st.length());
        System.out.println(str.length());
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(st.length()-1));
        System.out.println(st.concat(str));
        System.out.println(st.substring(1,3));//end index is never included
        System.out.println(st.substring(1)); //it will print from 1 till the end

    for(char c:st.toCharArray()){
        System.out.print(c+" ");
    }
    for(char c:str.toCharArray()){
        System.out.print(c+" ");
    }

    System.out.println(str.indexOf(""));//equals=checks the contain
    System.out.println(str.startsWith(" wo"));//== checks if thevalues's memory address is same
    System.out.println(st.startsWith("wo"));
    System.out.println(str.hashCode());
    char ch=scn.next().charAt(0);
    if(ch-'a'>=0 && ch-'a'<=26){
        System.out.println("lower case:"+ch);
    }else if(ch-'A'>=0 && ch-'A'<=26){
        System.out.println("Upper case:"+ch);

    } 
    else if(ch-'0'>=0 && ch-'0'<=9){
        System.out.println("Number:"+ch);}
    else 
    {System.out.println("Special char:"+ch);}
    
    }
}
