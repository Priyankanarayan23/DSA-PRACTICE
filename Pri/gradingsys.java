import java.util.*;
public class gradingsys {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int marks=scn.nextInt();
       if(marks>=90){
        System.out.println("Excellent");
       }
       else if(marks>=80){
        System.out.println("Good");
       }
       else if(marks>=70){
        System.out.println("Average");
       }
       else if(marks>=60){
        System.out.println("Below average");
       }
       else{
        System.out.println("Fail");
       }
    }
}
