package core.basics.function.inclass;

public class FunctionExamples {

    /**
     * Write a function which returns sum of 2 integers.
     */
    static int sum(int a, int b){
        int s = a+b;
        return s;
    }

    /**
     * Write a function that prints your name.
     */
    static void printName(){
        System.out.println("Hardik Khandelwal");
    }

    /**
     * Write a function which takes 2 integers as input
     * and returns their difference as output (i.e) subtract
     * first with second.
     */
    static int sub(int a, int b){
        int sub = a-b;
        return sub;
    }



    public static void main(String[] args) {
        int s1 = sum(3,4); // 7
        int s2 = sum(5,6);// 11
        int s3 = sum(9,10); // 19



        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        int q= 12;
        int r = 13;
        int sub1 = sub(q,r); // -1
        System.out.println(sub1);

        printName();
    }
}
