package leetcode;

import java.util.Scanner;

public class Main3ManachersAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder("$#");

        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            sb.append("#");
        }
        sb.append("@");
        System.out.println(sb.toString());
        int[] p = new int[sb.length()];
        int mx = 0, id = 0, resLen = 0, resCenter = 0;
        for(int i=1;i<sb.length();i++){
            p[i] = mx > i? Math.min(p[2*id-i], mx-i) : 1;
            while ((i+p[i])<sb.length()&&sb.charAt(i+p[i]) == sb.charAt(i-p[i])){
                p[i]++;
            }
            if(mx < i + p[i]){
                mx = i + p[i];
                id = i;
            }
            if(resLen < p[i]){
                resLen = p[i];
                resCenter = i;
            }
        }
        System.out.println(s.substring((resCenter-resLen)/2,(resCenter-resLen)/2+resLen-1));
    }
}
