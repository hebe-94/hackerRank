import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayDivision {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(5,2,2,1,5,3,2));
        int d = 9;
        int m = 3;

        // d = 찾는 숫자의 합
        // m = 칸 수
        int checkSum = 0, checkCNT = 0;
        int i =0;

        while(m <= s.size()){
            while(i < m){
                checkSum += s.get(i);
                i++;
            }
            if(checkSum == d){
                checkCNT++;
            }
            checkSum = 0;
            s.remove(0);
            i = 0;
        }

        System.out.println(checkCNT);


    }
}
