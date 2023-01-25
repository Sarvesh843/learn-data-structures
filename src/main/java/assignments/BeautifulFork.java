package assignments;

import java.util.Scanner;

public class BeautifulFork {


    /**
     * Input: int x, int y
     * Output: int[][]
     */
    static int[][] computeAllPoints(int x, int y){
        // if point is invalid, let the array element be -1,-1
        int[][] possibleVariations = {
                {-2,-1},
                {-2,1},
                {-1,-2},
                {-1,2},
                {2,-1},
                {2,1},
                {1,-2},
                {1,2}
        };

        int[][] points = new int[8][2];

        for(int i=0; i<8;i++){
            int newX= possibleVariations[i][0]+x;
            int newY = possibleVariations[i][1]+y;

            if(isValid(newX, newY)){
                points[i][0]= newX;
                points[i][1] = newY;
            }
            else{
                points[i][0]= -1;
                points[i][1] = -1;
            }
        }

        return points;
    }

    static boolean searchForPoint(int[][] points, int x, int y){

        if(x==-1 || y==-1){
            return false;
        }

        for(int i=0; i<points.length; i++){
            if(points[i][0]==x && points[i][1]==y){
                return true;
            }
        }
        return false;
    }

    static boolean checkCommonPoint(int[][] points1, int[][] points2){
        for(int i=0; i<points2.length; i++){
            if(searchForPoint(points1, points2[i][0], points2[i][1])){
                return true;
            }
        }
        return false;
    }

    // Function to check if a point is valid or not
    static boolean isValid(int x, int y){
        if(x<1 || y<1 || x>8 || y>8)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int x = sc.nextInt();
            int y= sc.nextInt();
            int a =sc.nextInt();
            int b = sc.nextInt();

            int[][] points1 = computeAllPoints(x,y);
            int[][] points2 = computeAllPoints(a,b);

            if(checkCommonPoint(points1, points2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

}
