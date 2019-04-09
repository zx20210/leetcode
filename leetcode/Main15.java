package leetcode;

import java.util.*;

public class Main15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSum(nums);
        for(List<Integer> l:list){
            System.out.print("[");
            for(Integer i:l){
                System.out.print(i);

            }
            System.out.println("]");
        }
        System.out.println("============================================");

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
//        Set<Set<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(i == k || i == j || j == k){
                        continue;
                    }
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> l = new ArrayList<>();
//                        Set<Integer> s = new HashSet<>();
//                        s.add(i);
//                        s.add(j);
//                        s.add(k);
//                        set.add(s);
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        list.add(l);
                    }
                }
            }
        }
//        for(Set<Integer> s:set){
//            System.out.print("[");
//            for(Integer i:s){
//                System.out.print(i);
//            }
//            System.out.println("]");
//        }
//        System.out.println("------------------");

        return list;
    }
}
