package assignments;
import java.util.*;

public class MakeTiny {
    static boolean isLexographicSmaller(String s, String t){
        char minS = s.charAt(0);

        for(int i=0; i< s.length(); i++){
            minS = (char)Math.min(minS, s.charAt(i));
        }

        char maxT = t.charAt(0);
        for(int i=0; i< t.length(); i++){
            maxT = (char)Math.max(maxT, t.charAt(i));
        }

        if( minS >= maxT){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if(isLexographicSmaller(s,t)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
