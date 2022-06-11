package june_22;

import java.util.Arrays;

public class BiggerIsGreater {
    public static void main(String[] args) {
        String w = "rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmsym";
        String resultString = "rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmyms";
//        String w = "dmsym";
//        String resultString = "dmyms";

        StringBuilder sb = new StringBuilder(w);
        System.out.println(w);
        int length = sb.length() - 1, index = -1, upperNumberIndex = w.length()+1;
        int firstNumber = sb.charAt(0), lastNumber = sb.charAt(length), minNumber = 'z' + 1;

        if(length == 0){
            System.out.println(sb);
        }

        for(int i = length-1; i >0; i--){
            System.out.print(sb.charAt(i)+"[" +(int)sb.charAt(i) +"]  ");
            char charData = sb.charAt(i+1);
            if(sb.charAt(i) > charData){
                index = i;
                break;
                // index는 교환 해야하는 값 사이의 인덱스
            }
            if(firstNumber < charData && minNumber > charData ){
                upperNumberIndex = i;
                minNumber = charData;
            }
        }
        System.out.println();
        System.out.println("index : " + index);
        System.out.println("index로 가져온 값 : " + sb.charAt(index));
        System.out.println("minNumber : " + (char)minNumber);
        String fixedString = "";
        char[] sortString = {};
        if(index != -1){ // 찾을 인덱스를 발견 // 여기서는 고정된 String을 만들고 뒤에 정렬해야할 내용은 따로 담기
            System.out.println("찾았다!");
            // 값을 바꿨고 고정된 String과 정렬할 String 나누기
            fixedString = sb.substring(0,index-1)+sb.charAt(index);
            sortString =  (sb.charAt(index-1) + sb.substring(index+1)).toCharArray();
            System.out.print(fixedString + "' \t '" + new String(sortString));
            System.out.println();
//            System.out.println(sb);
        }else{ // 앞의 문자를 바꿔야 한다.
            if(length + 2 == upperNumberIndex){ //초기화된 값이 변경된적 없을때 -> 문자 배열중 제일 클때, 모든 문자가 동일할때
                System.out.println("못바꾼다");
            }else{ // 맨앞의 문자를 변경 해야 할 때
                System.out.println("못찾았다");
                fixedString  = sb.charAt(upperNumberIndex) + "";
                sb.delete(upperNumberIndex,upperNumberIndex+1);
//                System.out.println(result);

                sortString = sb.toString().toCharArray();
            }
        }
        Arrays.sort(sortString);
        String result = fixedString + new String(sortString);
//        System.out.println(fixedString + new String(sortString));
        System.out.println("===========================================");
        System.out.println("원문 : \t\t\t\t" + w + "[" + w.length()+"]");
        System.out.println("정답문 : \t\t\t" +resultString + "[" + resultString.length()+"]");
        System.out.println("내가 만든 결과문 : \t" +result + "[" + result.length()+"]");
        if (result.equals(resultString)){
            System.out.println("같음");
        }else{
            System.out.println("다름");
        }
    }
}
