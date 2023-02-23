package assignments;

import java.util.HashSet;
import java.util.Scanner;

public class NumberOfCharactersInString {

    static int getUniqueCharCount(String s){
        HashSet<Character> hs = new HashSet<>();

        for(int i=0; i< s.length(); i++){
            hs.add(s.charAt(i));
        }
        return hs.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        System.out.println(getUniqueCharCount(s));
    }
}
