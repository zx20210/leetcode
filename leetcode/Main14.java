package leetcode;

public class Main14 {
    public static void main(String[] args) {
        String[] strs1 = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs1));
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs2));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        int minLength = 100000000;
        for(String s:strs){
            minLength = Math.min(s.length(), minLength);
        }
        int count = 0;
        String first = strs[0];
        for(int i = 0;i < minLength;i++){
            boolean flag = true;
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i) != first.charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }else{
                break;
            }
        }
        if(count>0){
            return first.substring(0, count);
        }else{
            return "";
        }

    }
}
