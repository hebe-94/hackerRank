package april_22;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayDivision {
    public static void main(String[] args) {
        // 이번 알고리즘은 Sliding Window의 알고리즘!

        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(5,2,2,1,5,3,2));
        int d = 9;
        int m = 3;

//        // d = 찾는 숫자의 합
//        // m = 칸 수
//        int checkSum = 0, checkCNT = 0;
//        int i =0;
//
//        while(m <= s.size()){
//            while(i < m){
//                checkSum += s.get(i);
//                i++;
//            }
//            if(checkSum == d){
//                checkCNT++;
//            }
//            checkSum = 0;
//            s.remove(0);
//            i = 0;
//        }


        int checkCNT = 0;
        // size     m       loop
        // 5       / 2      / 4
        // 6       / 2      / 4
        // 1       / 1      / 1
        // size - m + 1

        for(int i = 0; i < s.size()-m+1; i++){
            int checkSum = 0;
            for(int j = i; j < i+m; j++){
                checkSum+= s.get(j);
            }
            if(checkSum == d){
                checkCNT++;
            }
        }

        System.out.println(checkCNT);


    }
}
