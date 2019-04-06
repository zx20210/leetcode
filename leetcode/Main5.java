package leetcode;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[][] dp = new int[1005][1005];
        int maxLen = 0;
        int resI=0,resJ=0;
        int n = s.length();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                if(i-j<2){
                    dp[i][j] = s.charAt(i) == s.charAt(j)?1:0;
                }else{
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i-1][j+1] == 1?1:0;
                }
                if(dp[i][j] == 1 && maxLen<(i-j+1)){
                    maxLen = i-j+1;
                    resI = i;
                    resJ = j;
                }
            }
        }
//        System.out.println(resJ);
//        System.out.println(resI);
//        System.out.println(maxLen);

        System.out.println(s.substring(resJ, resI+1));
    }
}
