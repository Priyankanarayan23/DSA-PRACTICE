import java.util.*;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int p=scn.nextInt();
        System.err.println("rate of interest: ");
        int r=scn.nextInt();
        System.out.println("Enter the time period in years: ");
        int t=scn.nextInt();
        int simpi=0;
        System.out.println("Simple interest is:"+(p*r*t)/100);
    }
}
