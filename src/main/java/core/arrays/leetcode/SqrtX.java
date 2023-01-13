package core.arrays.leetcode;

public class SqrtX {
    //    https://leetcode.com/problems/sqrtx/description/
    /**
     4 = 2*2

     5 = 2.23. -> 2

     8 = 2.82 -> 2
     9 -> 3


     Given non negative integer x

     sqrt(x)

     n = 5

     low = 1
     high = 5

     1 2 3 4 5 6 7 8 9

     mid = (1+5)/2 = 3
     square = 3*3 = 9

     low = 1
     high = 2
     mid = (1+2)/2 = 1

     sqaure = 1

     low = 2
     high = 2

     square = 4

     low = mid+1 = 3
     high = 2



     */

    public int mySqrt(int x) {

        if(x==1){
            return x;
        }

        long low = 1;
        long high = x;

        while(low <= high){
            long mid = (low+high)/2;
            long square = mid*mid;

            if( square == x){
                return (int)mid;
            }
            else if(square < x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return (int)high;

    }
}
