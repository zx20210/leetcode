package leetcode;

public class Main9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) {
//        if(x<0){
//            return false;
//        }
        StringBuilder string = new StringBuilder(Integer.toString(x));
        System.out.println(string);
        StringBuilder reverse = new StringBuilder(string);
        reverse.reverse();

        int count = 0;
        while(count<string.length() && string.charAt(count) == reverse.charAt(count)){
            count++;
        }
        return count == string.length();

    }
}
