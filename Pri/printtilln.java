import java.util.*;
public class printtilln {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
    int low =scn.nextInt();
    int high =scn.nextInt();
    for(int i=low;i<=high;i++){
       int flag=0;
         for(int div=2;div*div<=i;div++){
             if(i%div==0){
                    flag++;
                    break;
                 }          
    }
    if(flag==0){
        System.out.println("prime:"+i);
    } 
    else{
        System.out.println("not prime"+i);
    }
    }}}
    


