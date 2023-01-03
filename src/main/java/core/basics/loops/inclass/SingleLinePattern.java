package core.basics.loops.inclass;

public class SingleLinePattern {

    /**
     *  Given some n, can you print this pattern
     *
     * 1 2 3 4 5 6 7 8 .. ..... n
     *
     * example:
     * n = 3
     * 1 2 3
     *
     * n =  4
     * 1 2 3 4
     *
     * n= 5
     * 1 2 3 4 5
     */
    static void printRow(int n){
        for (int i=1; i <= n ; i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        printRow(19);
    }
}
