package leetcode;

import java.util.Arrays;

public class Main16 {
    private static int threeSumClosest(int[] nums, int target) {
        int res = 0;
        int n = nums.length;
        int minDifference = 0x3f3f3f3f;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int left = i+1;
            int right = n-1;
            int sum;
            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(sum - target)<minDifference){
                    minDifference = Math.abs(sum - target);
                    res = sum;
                }
                if(sum == target){
                    return sum;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,4};
        System.out.println(threeSumClosest(nums, 1));
    }
}
