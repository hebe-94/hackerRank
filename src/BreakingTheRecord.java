import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecord {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(3,4,21,36,10,28,35,5,24,42));

        int minNum = scores.get(0), maxNum = scores.get(0);
        int minCNT = 0, maxCNT = 0;
        List<Integer> result = new ArrayList<>(Arrays.asList(0,0));
        for(int i = 1; i < scores.size(); i++){
            int score = scores.get(i);
            if(score > maxNum){
                maxNum = score;
                maxCNT++;
            }else if(score < minNum){
                minNum = score;
                minCNT++;
            }
        }

        System.out.println(maxCNT + " " +minCNT);

    }
}
