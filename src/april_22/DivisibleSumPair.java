package april_22;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleSumPair {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,3,2,6,1,2));

        int n = 6;
        int k = 3;
        int resultCNT = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j <n; j++){
                if((ar.get(i) + ar.get(j)) % k == 0){
//                    System.out.println(ar.get(i) + " : " + ar.get(j));
                    resultCNT++;
                }
            }
        }

        System.out.println(resultCNT);

    }
}
