package leetcode;

public class Main6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 2;
        char[][] matrix = new char[numRows][1000];
        boolean flag = false;//false下行，true右上行
        int i = 0, j = 0;
        int index = 0;
        while(index < s.length()){
            if(flag == false){
                while(i < numRows && index < s.length()){
                    System.out.println(s.charAt(index));
                    matrix[i++][j] = s.charAt(index++);
                }
                System.out.println(i+"\t"+j);
                i -= 2;
                j++;
                flag = true;
            }else{
                while(i >= 0 && index < s.length()){
                    System.out.println(s.charAt(index));
                    matrix[i--][j++] = s.charAt(index++);
                }
                System.out.println(i+"\t"+j);
                i += 2;
                j--;
                flag = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char[] chs : matrix){
            for(char ch:chs){
                System.out.print(ch+"-");

                if(ch != 0){
                    sb.append(ch);
                }
            }
            System.out.println();
        }
        System.out.println(sb.toString());
    }
}
