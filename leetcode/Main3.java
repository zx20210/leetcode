package leetcode;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        int[] nums1 = new int[1005];
        int[] nums2 = new int[1005];
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        for(int i = 0;i < m;i++){
            nums1[i] = in.nextInt();
        }

        for(int i = 0;i < n;i++){
            nums2[i] = in.nextInt();
        }
//        int[] nums1 = {1,2};
//        int[] nums2 = {3,4};
//        int m = 2,n = 2;
        List<Integer> list = new ArrayList<>();
        boolean flag = (m+n)%2 == 1;

        int mid1 = m/2;
        int mid2 = n/2;
        int left1 = 0, left2 = 0;
        int right1 = m, right2 = n;
        double res;
        if(nums1.length == 0 || nums2.length == 0){
            if(nums1.length == 0){
                res = nums2[mid2];
            }else{
                res = nums1[mid1];
            }
        }else{
            if(nums1[mid1] < nums2[mid2]){
                while(mid1<=m && mid2>0){
                    if(nums1[mid1] < nums2[mid2]){
                        left1 = mid1;
                        mid1 = (left1 + right1)/2;
                        right2 = mid2;
                        mid2 = (right2 + left2)/2;
                    }else{
                        break;
                    }
                }
                if(flag){
                    res = (double)Math.min(nums1[mid1],nums2[mid2]);
                }else{
                    int tmp[] = {nums1[mid1-1],nums2[mid2+1],nums1[mid1],nums2[mid2]};
                    Arrays.sort(tmp);
                    res = ((double)tmp[1]+tmp[2])/2;
                }
            }else if(nums1[mid1] > nums2[mid2]){
                while(mid1 > 0 && mid2 <= n){
                    if(nums1[mid1] > nums2[mid2]){
                        right1 = mid1;
                        mid1 = (left1 + right1)/2;
                        left2 = mid2;
                        mid2 = (left2 + right2)/2;
                    }else{
                        break;
                    }
                }
                if(flag){
                    res = (double)Math.max(nums1[mid1],nums2[mid2]);
                }else{
                    int tmp[] = {nums1[mid1-1],nums2[mid2+1],nums1[mid1],nums2[mid2]};
                    Arrays.sort(tmp);
                    res = ((double)tmp[1]+tmp[2])/2;
                }

            }else{
                res = (double)nums1[mid1];
            }
        }

        System.out.println(res);

    }
}
