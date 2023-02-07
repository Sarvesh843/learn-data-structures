package assignments;

public class Multiplication {

    /**
     *
     *  F(M,N) = M + M + M + M + M ..... N times
     *
     *  F(M,N) = M + F(M, N-1)
     *
     *  Base condition: N==0, return 0
     */

    static int  Multiply(int M, int N)
    {
        if( N==0){
            return 0;
        }
        else{
            return M + Multiply(M, N-1);
        }
    }
}
