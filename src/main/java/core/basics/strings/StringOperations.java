package core.basics.strings;

public class StringOperations {
    public static void main(String[] args) {
        String s = new String("Hardik");
        // Get a character at a certain index
        char c2 = s.charAt(1);
        System.out.println(c2);

        // Convert string to character array
        char[] arr = s.toCharArray();

        // What if you want to combine two strings
        String firstName = new String("Hardik");
        String lastName = new String("Khandelwal");

        String fullName = firstName +" "+lastName;
        System.out.println(fullName);
        // Length of string
        System.out.println(fullName.length());


        System.out.println( s == firstName );
        // Check equality on content of string
        System.out.println(s.equals(firstName));

        // extract part of string: Sub string
        String subStr = s.substring(2, 5);
        System.out.println(subStr);

    }
}
