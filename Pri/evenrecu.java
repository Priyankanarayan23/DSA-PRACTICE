import java.util.*;
class evenrecu{
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n =scn.nextInt();
    even(n);
}
public static void even(int n){
    if(n==100) return;
    System.out.print(n+" ");
    even(n+2);
}
}