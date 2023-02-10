package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class CountFrequency {
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        clist.add(c);
    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
        if(clist.contains(c) == true)
            System.out.println(Collections.frequency(clist, c));
        else
            System.out.println("Not Present");
    }
}
