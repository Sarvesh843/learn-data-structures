package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MakeTinyStrings {
    /**
     * school S
     * newton T
     *
     * chloos
     * ennotw
     *
     * efgh
     * abcd
     */
    static boolean isLexographicSmaller(String s, String t){
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for(int i=0; i<sArr.length; i++){
            if(sArr[i] == tArr[i]){
                continue;
            }
            else if( sArr[i] > tArr[i]){
                return false;
            }
            else{
                return true;
            }
        }

        return false;
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
