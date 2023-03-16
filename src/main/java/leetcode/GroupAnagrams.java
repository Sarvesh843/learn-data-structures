package leetcode;
import java.util.*;
public class GroupAnagrams {
    //https://leetcode.com/problems/group-anagrams/description/

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for(String s: strs){
            String sortedString = getSortedString(s);

            if(!hm.containsKey(sortedString)){
                hm.put(sortedString, new ArrayList<>());
            }

            hm.get(sortedString).add(s);
        }

        ArrayList<List<String>> al = new ArrayList<>();

        for(String key: hm.keySet()){
            al.add(hm.get(key));
        }

        return al;

    }

    private String getSortedString(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
