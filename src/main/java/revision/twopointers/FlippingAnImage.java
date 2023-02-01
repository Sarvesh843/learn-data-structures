package revision.twopointers;

public class FlippingAnImage {
    /**
     1 1 0     -> 0 1 1.  -> 1 0 0
     1 0 1        1 0 1      0 1 0
     0 0 0.       0 0 0.     1 1 1

     Step 1: Reverse a row
     Step 2: Invert the array
     */

    void reverseRow(int[][] image, int row){
        int m = image[0].length;

        int ptr1= 0;
        int ptr2 = m-1;

        while( ptr1 < ptr2 ){
            int temp = image[row][ptr1];
            image[row][ptr1] = image[row][ptr2];
            image[row][ptr2] = temp;
            ptr1++;
            ptr2--;
        }
    }

    void invertImage(int[][] image){
        for(int i=0; i< image.length; i++){
            for(int j=0; j< image[0].length; j++){
                image[i][j] = (image[i][j]+1)%2;
            }
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i < image.length; i++){
            reverseRow(image, i);
        }

        invertImage(image);
        return image;
    }
}
