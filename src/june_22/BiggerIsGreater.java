package june_22;

import java.util.Arrays;

public class BiggerIsGreater {
    public static void main(String[] args) {
        String w = "dcba";
        StringBuilder sb = new StringBuilder(w);
        int length = sb.length() - 1;
        System.out.println(length);
        int index = -1, upperNumberIndex = w.length()+1;
        int firstNumber = sb.charAt(0);
        int lastNumber = sb.charAt(length);
        int minNumber = 'z' + 1;
        String result = "";
//        System.out.println("===============");
//        System.out.println("원문 : " + sb);
//        System.out.println("firstNumber : "+(char)firstNumber+"[" +firstNumber +"]");
//        System.out.println("lastNumber : "+(char)lastNumber+"[" +lastNumber +"]");
//        System.out.println("===============");
        if(length == 0){
            System.out.println(sb);
        }

        for(int i = length-1; i >=0; i--){
            System.out.print(sb.charAt(i)+"[" +(int)sb.charAt(i) +"]  ");
            char charData = sb.charAt(i);
            if(lastNumber > charData){
                index = i;
                break;
            }
            if(firstNumber < charData && minNumber > charData ){
                upperNumberIndex = i;
                minNumber = charData;
            }
        }
        System.out.println();
        if(index != -1){
            System.out.println("찾았다!");
            char temp = sb.charAt(index);
            sb.replace(index,index+1,(char)lastNumber+"");
            sb.replace(length,length+1,temp+"");
            System.out.println(sb);
        }else{
            if(length + 2 == upperNumberIndex){
                System.out.println("못바꾼다");
            }else{
                result  = sb.charAt(upperNumberIndex) + "";
                sb.delete(upperNumberIndex,upperNumberIndex+1);
                System.out.println(result);
                char[] sol = sb.toString().toCharArray();
                Arrays.sort(sol);
                result += new String(sol);
                System.out.println(result);
                System.out.println("못찾았다");
            }
        }
    }
}
