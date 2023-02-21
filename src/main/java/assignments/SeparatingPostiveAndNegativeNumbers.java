package assignments;

import java.util.*;

public class SeparatingPostiveAndNegativeNumbers {
    static void seperate(int[] arr,int n){
        ArrayList<Integer> positive=new ArrayList<>(); // 1 2 6 5
        ArrayList<Integer> negative=new ArrayList<>(); // -1 -4 -6
        for(int el:arr){
            if(el>=0){
                positive.add(el);
            }else{
                negative.add(el);
            }
        }
        negative.addAll(positive);
        for(int i=0;i<n;i++){
            System.out.print(negative.get(i)+" ");
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        seperate(arr,n);
    }
}
