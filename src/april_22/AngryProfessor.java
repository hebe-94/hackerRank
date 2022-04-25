package april_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AngryProfessor {
    // Utopian Tree 다음문제
    public static void main(String[] args) {
        // 수업 취소 : YES, 수업 진행 : NO
        int k = 2;
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0,-1,2,1));
        String resultMsg = "YES";
        int stuCNT = 0;
        Collections.sort(a);
        System.out.println(a);
        for(Integer data : a){
            if(data > 0) break;
            stuCNT++;
            if(stuCNT >= k){
                resultMsg = "NO";
                break;
            }
        }

        System.out.println(resultMsg);
    }
}
