package formingAMagicSquare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormingAMagicSquareVer1 {
    public static void main(String[] args) {
        List<Integer> i1 = new ArrayList<>(Arrays.asList(4,9,2));
        List<Integer> i2 = new ArrayList<>(Arrays.asList(3,5,7));
        List<Integer> i3 = new ArrayList<>(Arrays.asList(8,1,5));
        List<List<Integer>> s = new ArrayList<>();
        s.add(i1);
        s.add(i2);
        s.add(i3);
        if(s.get(1).get(1) != 5){
            s.get(1).set(1, 5);
            System.out.println("중앙 바뀜");
        }
        int[] arCheckNum = new int[10];
        int result =0;
        for(int i = 0; i<s.size(); i++){
            for(int j = 0; j <s.get(i).size(); j++){
                arCheckNum[s.get(i).get(j)] += 1;
            }
        }

        System.out.println("현재 데이터");

        // 데이터 확인
        for (int i = 1; i< 10; i++){
            System.out.print("[" +i + "]"+ "\t\t");
        }
        System.out.println();
        for(int i = 1; i<arCheckNum.length; i++){
            System.out.print(arCheckNum[i] + "\t\t");
        }

        System.out.println();
        System.out.println();
        System.out.println("현재 배열");
        for (int i = 0; i<s.size(); i++){
            System.out.print("\t");
            for(int j =0; j<s.get(i).size(); j++){
                System.out.print(s.get(i).get(j) + "\t");
            }
            System.out.print(" |" + s.get(i).stream().mapToInt(Integer::intValue).sum());
            System.out.println();
        }
        System.out.println("-\t-\t-\t-\t-\t");
        int sum =0;
        System.out.print(s.get(0).get(2) + s.get(1).get(1) + s.get(2).get(0) + "\t");
        System.out.print(s.get(0).get(0) + s.get(1).get(0) + s.get(2).get(0) + "\t");
        System.out.print(s.get(0).get(1) + s.get(1).get(1) + s.get(2).get(1) + "\t");
        System.out.print(s.get(0).get(2) + s.get(1).get(2) + s.get(2).get(2) + "\t");
        System.out.print(s.get(0).get(0) + s.get(1).get(1) + s.get(2).get(2) + "\t");




//
//        List<Integer> overlapData = new ArrayList<>(); // 중복된 수
//        List<Integer> checkData = new ArrayList<>(); // 필요한 숫자
//
////        System.out.println(total);
//        for (int i=1; i<10; i++){
//            if( Collections.frequency(total, i) > 1){
//                overlapData.add(i);
//            }
//            if( Collections.frequency(total, i) == 0){
//                checkData.add(i);
//            }
//        }

//        for (int i = 0; i<checkData.size(); i++){
//            result += Math.abs(checkData.get(i) - overlapData.get(i));
//        }

//        System.out.println(overlapData);
//        System.out.println(checkData);
//        System.out.println(result);




    }
}
