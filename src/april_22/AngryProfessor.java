package april_22;

import java.util.ArrayList;
import java.util.Arrays;

public class AngryProfessor {
    // Utopian Tree 다음문제
    public static void main(String[] args) {
        // 수업 취소 : YES, 수업 진행 : NO
        int k = 0;
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3,4,21,36,10,28,35,5,24,42));
        String resultMsg = "NO";
        int stuCNT = 0;
        for(Integer student : a){
            if(student <= 0){
                stuCNT++;
            }
        }
    }
}
