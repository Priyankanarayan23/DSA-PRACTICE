import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spac=n-1;
        int star=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spac; j++) {
                System.out.print(" ");
}
            for(int j=1;j<=star;j++){
                System.out.print('*');
}
spac--;
star++;
        System.out.println("");}
    }}