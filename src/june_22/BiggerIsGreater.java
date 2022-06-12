package june_22;

import java.util.Arrays;

public class BiggerIsGreater {
    public static void main(String[] args) {
//        String w = "dkhc";
//        String resultString = "hcdk";
//        String w = "rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmsym";
//        String resultString = "rebjvsszebhehuojrkkhszxltyqfdvayusylgmgkdivzlpmmtvbsavxvydldmyms";
//        String w = "dmsym";
//        String resultString = "dmyms";

//        StringBuilder sb = new StringBuilder(w);
////        System.out.println(w);
//        int length = sb.length(), index = -1, upperNumberIndex = w.length()+1;
//        int firstNumber = sb.charAt(0), minNumber = 'z' + 1;
//        int forRange = length == 2? 1 : 2;
//        for(int i = length-1; i >=forRange; i--){
//            char charData = sb.charAt(i);
//            System.out.println("i-1 : " + sb.charAt(i-1) + "  i : " + sb.charAt(i));
//            if(sb.charAt(i-1) < charData){
//                index = i; // i가 찾은 단어 사이
//                break;
//            }
//            if(firstNumber < charData && minNumber > charData ){
//                upperNumberIndex = i;
//                minNumber = charData;
//            }
//        }
//        System.out.println();
//        System.out.println("length : " + length);
//        System.out.println("index : " + index);
////        System.out.println("index로 가져온 값 : " + sb.charAt(index));
////        System.out.println("minNumber : " + (char)minNumber);
//        String fixedString = "";
//        char[] sortString = {};
//        if(index != -1){
//            System.out.println("찾았다");
//            fixedString = sb.substring(0,index-1) + sb.charAt(index);
//            sortString = (sb.charAt(index-1) + sb.substring(index+1)).toCharArray();
//            System.out.println("고정문 : " + fixedString);
//            System.out.println("sort 예정 : " + sb.substring(index+1));
//        }else{
//            if(length + 1 == upperNumberIndex){
//                System.out.println("못바꾼다");
//            }else{ // 맨앞의 문자를 변경 해야 할 때
//                System.out.println("못찾았다");
//                fixedString  = sb.charAt(upperNumberIndex) + "";
//                sb.delete(upperNumberIndex,upperNumberIndex+1);
//                sortString = sb.toString().toCharArray();
//            }
//        }
//        Arrays.sort(sortString);
//        String result = fixedString + new String(sortString);
////        System.out.println(fixedString + new String(sortString));
//        System.out.println("===========================================");
//        System.out.println("원문 : \t\t\t\t" + w + "[" + w.length()+"]");
//        System.out.println("정답문 : \t\t\t" +resultString + "[" + resultString.length()+"]");
//        System.out.println("내가 만든 결과문 : \t" +result + "[" + result.length()+"]");
//        if (result.equals(resultString)){
//            System.out.println("같음");
//        }else{
//            System.out.println("다름");
//        }



//        StringBuilder sb = new StringBuilder(w);
////        System.out.println(w);
//        int length = sb.length(), index = -1, upperNumberIndex = w.length()-1;
//        int firstNumber = sb.charAt(0), minNumber = sb.charAt(length-1);
//        int forRange = length == 2? 1 : 2;
//        for(int i = length-1; i >1; i--){
//            char charData = sb.charAt(i);
////            System.out.println("i-1 : " + sb.charAt(i-1) + "  i : " + sb.charAt(i));
//            if(sb.charAt(i-1) < charData){
//                index = i-1;
//                break;
//            }
//            if(firstNumber < charData && minNumber < charData ){
//                upperNumberIndex = i-1;
//                minNumber = charData;
//            }
//        }
//        System.out.println();
//        System.out.println("length : " + length);
//        System.out.println("index : " + index);
////        System.out.println("index로 가져온 값 : " + sb.charAt(index));
////        System.out.println("minNumber : " + (char)minNumber);
//        String fixedString = "";
//        String sortString = "";
//        if(index != -1){
//            System.out.println("찾았다");
//            fixedString = sb.substring(0,index) + sb.charAt(upperNumberIndex);
//            sb.delete(upperNumberIndex,upperNumberIndex+1);
//
////            sortString = (sb.charAt(index-1) + sb.substring(index+1)).toCharArray();
//            sortString = sb.substring(index);
//            System.out.println("고정문 : " + fixedString);
//            System.out.println("sort 예정 : " + sortString);
//        }else{
//            if(length + 1 == upperNumberIndex){
//                System.out.println("못바꾼다");
//            }else{ // 맨앞의 문자를 변경 해야 할 때
//                System.out.println("못찾았다");
//                fixedString  = sb.charAt(upperNumberIndex) + "";
//                sb.delete(upperNumberIndex,upperNumberIndex+1);
//                sortString = sb.toString();
//            }
//        }
//        char[] sortData = sortString.toCharArray();
//        Arrays.sort(sortData);
//        String result = fixedString + new String(sortData);
////        System.out.println(fixedString + new String(sortString));
//        System.out.println("===========================================");
//        System.out.println("원문 : \t\t\t\t" + w + "[" + w.length()+"]");
//        System.out.println("정답문 : \t\t\t" +resultString + "[" + resultString.length()+"]");
//        System.out.println("내가 만든 결과문 : \t" +result + "[" + result.length()+"]");
//        if (result.equals(resultString)){
//            System.out.println("같음");
//        }else{
//            System.out.println("다름");
//        }

//        String w = "dkhc";
//        System.out.println(w);
//        String resultString = "hcdk";
//        System.out.println(resultString);
//
//        StringBuilder sb = new StringBuilder(w);
//        int length = sb.length(), index = -1, upperNumberIndex = w.length();
//        int firstNumber = sb.charAt(0), minNumber = sb.charAt(length-1);
//        int forRange = length == 2? 1 : 2;
//        String fixedString = "";
//        String sortString = "";
//        String result = "no answer";
//
//        for(int i = length-1; i > 0; i--){
//            char charData = sb.charAt(i);
//            char charData1 = sb.charAt(i-1);
////            System.out.println("i-1 : " + sb.charAt(i-1) + "  i : " + sb.charAt(i));
//            if(firstNumber < charData && minNumber <= charData ){
//                upperNumberIndex = i;
//                minNumber = charData;
//            }
//            if(charData1 < charData){
//                index = i-1;
//                break;
//            }
//        }
//        System.out.println("최종 index : " + index);
//
//        if(index != -1){ //find data
//            System.out.println((char)minNumber);
//            fixedString = sb.substring(0,index) + (char)minNumber;
//            sb.delete(upperNumberIndex,upperNumberIndex+1);
//            sortString = sb.substring(index,length-1);
//            System.out.println("find : ");
//            System.out.println("result : " +fixedString + " " + sortString);
//
//        }else{ // first data change
//            System.out.println("first data change");
//            if(sb.charAt(0) == (char)minNumber){
//                System.out.println("동일한 데이터");
//            }
//            System.out.println(upperNumberIndex);
//            fixedString  = sb.charAt(upperNumberIndex) + "";
//            sb.delete(upperNumberIndex,upperNumberIndex+1);
//            sortString = sb.toString();
//            System.out.println("result : " +fixedString + " " + sortString);
//        }
//        char[] sortData = sortString.toCharArray();
//        Arrays.sort(sortData);
//        result = fixedString + new String(sortData);
//        System.out.println(result);




        String w = "dkhc";
        System.out.println(w);
        String resultString = "hcdk";
        System.out.println(resultString);

        char charArray[] = w.toCharArray();
        int length = w.length();
        int i;
        for(i = length-1; i > 0; i--){
            if(charArray[i] > charArray[i - 1]){
                break;
            }
        }

        if(i == 0){ //find data
            return "no answer";
        }else {
            // index left and right data based on index
            int changeDataLeftIdx = i-1, changeDataRightIdx = i;
            // find data of index the smallest word (
            for (int startIndex = i+1; startIndex < length; startIndex++) {
                if (charArray[startIndex] > charArray[changeDataLeftIdx] && charArray[startIndex] < charArray[changeDataRightIdx]) {
                    changeDataRightIdx = startIndex;
                }
            }

            // chage
            char temp = charArray[i-1];
            charArray[i-1] = charArray[changeDataRightIdx];
            charArray[changeDataRightIdx] = temp;
            // sort i to end index
            Arrays.sort(charArray, i, length);
        }
        System.out.println(new String(charArray));
    }
}


//fixedString  = sb.charAt(upperNumberIndex) + "";
//        sb.delete(upperNumberIndex,upperNumberIndex+1);
////                System.out.println(result);
//
//        sortString = sb.toString().toCharArray();