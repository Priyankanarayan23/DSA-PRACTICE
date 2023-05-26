import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        int arr[]=new int[t];
       for(int i=0;i<arr.length;i++){
         arr[i]=scn.nextInt();
       }
      
        for(int n:arr){
            int evensum=0;
            int oddsum=0;
            while(n>0){
int dig=n%10;
if(dig%2==0){
    evensum+=dig;
}
else oddsum+=dig;
n/=10;}
if(evensum%4==0 || oddsum%3==0){
    System.out.println("Yes");
}
else System.out.println("No");

        }
    }
}
