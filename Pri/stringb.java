import java.util.*;
public class stringb {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the word:");
        String s=scn.nextLine();
        StringBuilder sbr=new StringBuilder(s);
        sbr.reverse();
        System.out.println("Reverse :"+ sbr);
        if(s.equals(sbr)){
            System.out.println("matched");
        }
        else   System.out.println("does not matched");
sbr.append("bye");
System.out.println("Append bye: "+sbr);
sbr.insert(2,"pri");
System.out.println("Insert pri into second index : "+sbr);
        }
    }

