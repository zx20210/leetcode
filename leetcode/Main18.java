package leetcode;

import java.util.*;

public class Main18 {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2,3};
        System.out.println(fourSum(nums, 0));
    }
    private static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int res = 0;
        int n = nums.length;
        int minDifference = 0x3f3f3f3f;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                List<Integer> l = new ArrayList<>();
                int left = j+1;
                int right = n-1;
                int sum;
                while(left < right){
                    sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        List tuple = Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        if(!list.contains(tuple)){
                            list.add(tuple);
                        }
                        while(left < right && nums[left+1]==nums[left]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right-1]){
                            right--;
                        }
                        left++;
                        right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }



                }
            }
        }
        return list;
    }
}
