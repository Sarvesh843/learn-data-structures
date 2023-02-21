package assignments;

import java.util.*;

public class MinimizeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] nums1 = new Integer[n];
        Integer[] nums2 = new Integer[n];
        for(int i=0;i<n;i++){
            nums1[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            nums2[i] = sc.nextInt();
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2, Collections.reverseOrder());


        int ans = 0;
        for(int i=0; i<n;i++){
            ans+= nums1[i]*nums2[i];
        }
        System.out.println(ans);
    }
}
