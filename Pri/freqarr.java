import java.util.*;
public class freqarr {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the word:");
    String s=scn.nextLine();
    int arr[]=new int[26];
for(char c:s.toCharArray()){
    arr[c-'a']++;
}
String ans="";
for(char c:s.toCharArray()){
    if(arr[c-'a']>0){
        ans+=c;
        ans+=arr[c-'a'];
        arr[c-'a']=0;
    }
}
System.out.println("Frequency: "+ ans);
  }  
}
