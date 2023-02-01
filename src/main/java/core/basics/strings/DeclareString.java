package core.basics.strings;

public class DeclareString {
    public static void main(String[] args) {
        String way1 = "hardik";
        String way4 = "hardik";

        String way2 = new String("hardik");
        String way3 = new String("hardik");

        System.out.println( way2 == way3 );
        System.out.println( way1 == way4 );
    }
}
