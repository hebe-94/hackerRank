package june_22;

import java.util.Arrays;

public class BiggerIsGreater {
    public static void main(String[] args) {
        String w = "abdc";
        StringBuilder sb = new StringBuilder(w);
//        System.out.println(length);
        int length = sb.length() - 1, index = -1, upperNumberIndex = w.length()+1;
        int firstNumber = sb.charAt(0), lastNumber = sb.charAt(length), minNumber = 'z' + 1;
        String result = "";

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
//                System.out.println(result);
                char[] sol = sb.toString().toCharArray();
                Arrays.sort(sol);
                result += new String(sol);
            }
        }
        System.out.println(result);
    }
}
