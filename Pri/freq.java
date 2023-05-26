import java.util.*;
public class freq {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    String s=scn.nextLine();
    HashMap<Character,Integer> map= new HashMap<>();
    for(char c:s.toCharArray()) map.put(c,map.getOrDefault(c, 0)+1); 
String ans=" ";
for(char c:s.toCharArray()){
    if(map.get(c)>0){
        ans+=c;
        ans+=map.get(c)+"";
        map.put(c,0);
    }
}
System.out.println(ans);
  }
}




