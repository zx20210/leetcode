package leetcode;

import java.util.Calendar;

public class Main8 {
    public static void main(String[] args) {
        /**
         * "     -42"
         * "4253wdasd"
         * "saskdjg  4521"
         * "-91283472332"
         */
        System.out.println(myAtoi("     -42"));
        System.out.println(myAtoi("4253sajfas"));
        System.out.println(myAtoi("sjfakdj asjd232"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi(" "));
    }
    public static int myAtoi(String str) {
        if(str.equals("")){
            return 0;
        }
        StringBuilder sb = new StringBuilder(str);
        boolean isNagative = false;
        if(sb.length() == 0){
            return 0;
        }
        while(sb.length()>=0 && sb.charAt(0) == ' '){
            sb.deleteCharAt(0);
            if(sb.length() == 0){
                return 0;
            }
        }
        if( sb.charAt(0) == '-'){
            isNagative = true;
            sb.deleteCharAt(0);
        }else if(sb.charAt(0) == '+'){
            isNagative = false;
            sb.deleteCharAt(0);
        }
        if(sb.length()==0 || !Character.isDigit(sb.charAt(0))){
            return 0;
        }
        long current = 0L;
        int index = 0;
        while(!Character.isDigit(sb.charAt(index))){
            index++;
        }
        boolean first = true;
        if(index == sb.length()){
            return 0;
        }else{

            while(index < sb.length() && Character.isDigit(sb.charAt(index))){
                current = current*10 + ((int)sb.charAt(index)-48);

                index++;
                if(current > 2147483647 || current < -2147483648){
                    if(isNagative == true){
                        current = -current;
                    }
                    if(current > 0){
                        return 2147483647;
                    }else{
                        return -2147483648;
                    }
                }
            }
        }

        if(isNagative == true){
            current = -current;
        }

        return (int)current;


    }
}
