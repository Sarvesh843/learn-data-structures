package core.basics.loops.inclass;

public class SingleLinePatternDescending {

    /**
     *  Given some n, can you print this pattern
     *
     * print in descending
     *
     * n n-1 n-2  ....... 1
     *
     * example:
     * n = 3
     * 3 2 1
     *
     * n =  4
     * 4 3 2 1
     *
     * n= 5
     * 5 4 3 2 1
     */
    static void printDesc(int n){
        for(int i= n ; i>= 1; i--){
            System.out.print(i+" ");
        }

    }


    public static void main(String[] args) {
        printDesc(9);
    }
}
