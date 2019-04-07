package leetcode;

public class Main7 {
    public static void main(String[] args) {
        int x = 1534236469;
        long res = 0L;
        if(x < 0){
            String str = String.valueOf(x);
            str = str.substring(1, str.length());
            StringBuilder sb = new StringBuilder(str);
            sb = sb.reverse();
            while(sb.charAt(0) == '0'){
                sb.deleteCharAt(0);
            }
            res = Long.valueOf("-"+sb.toString());
        }else{
            String str = String.valueOf(x);
            StringBuilder sb = new StringBuilder(str);
            sb = sb.reverse();
            while(sb.charAt(0) == '0'){
                sb.deleteCharAt(0);
            }
            res = Long.valueOf(sb.toString());

        }

        if(res < 2147483647 && res > -2147483648 ){
            System.out.println((int)res);
        }else {
            System.out.println(0);
        }
    }
}
