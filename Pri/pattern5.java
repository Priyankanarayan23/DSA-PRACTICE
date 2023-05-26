import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
int nspace=n/2;
int nstar=1; 
for(int i=1;i<=n;i++){
    for(int j=1;j<=nspace;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=nstar;j++){
        System.out.print('*');
    }
    if(i>n/2){
        nspace++;
        nstar-=2;
    }
    else{
        nspace--;
        nstar+=2;
    }
    System.out.println(" ");
}
}
}
