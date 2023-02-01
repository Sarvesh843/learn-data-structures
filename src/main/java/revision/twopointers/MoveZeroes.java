package revision.twopointers;

public class MoveZeroes {

    // https://leetcode.com/problems/move-zeroes/description/

    public void moveZeroes(int[] nums) {
        int zeros = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zeros++;
            }
            else{
                nums[i-zeros] = nums[i];
            }
        }

        for(int i=1; i<=zeros; i++){
            nums[nums.length - i] = 0;
        }
    }
}
