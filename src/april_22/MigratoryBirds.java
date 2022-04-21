package april_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(9,9));

        List<Integer> result = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0));

        for(Integer num : arr){
            result.set(num, result.get(num)+1);
        }

        int max = Collections.max(result);
        System.out.println("제일 많이 나온 횟수 : " + max);
        System.out.println("max : "+max+ "\t 그 값의 인덱스 : " + result.indexOf(max));
    }
}
