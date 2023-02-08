package core.basics.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(5);
        al.add(3);

        System.out.println(al);

        System.out.println(al.get(3));
        System.out.println(al.size());

        al.add(10);
        System.out.println(al.size());

        al.remove(2);
        System.out.println(al);
    }
}
