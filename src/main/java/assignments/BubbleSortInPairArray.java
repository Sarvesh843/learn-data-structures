package assignments;
import java.util.Arrays;

public class BubbleSortInPairArray {
    static class Pair{
        int x;
        int y;
    }

    static Pair[] SortPair(Pair arr[], int n)  {
        //enter your code here
        Arrays.sort(arr, (a, b)->{
            if(a.x == b.x){
                return Integer.compare(b.y,a.y);
            }
            else{
                return Integer.compare(b.x, a.x);
            }
        });

        return arr;
    }
}
