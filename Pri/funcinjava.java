import java.util.*;
public class funcinjava{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        world();
        System.out.println(sum(a,b));
        System.out.println(multiply(a,b));
    }
    public static void world(){
        System.out.println("Hello world");
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
}