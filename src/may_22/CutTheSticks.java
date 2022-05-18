package may_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,3,3,2,1));
        ArrayList<Integer> result = new ArrayList<>();

        while(arr.size() > 0){
            result.add(arr.size());
            int minData= Collections.min(arr);
//            for(int i = 0; i< arr.size(); i++){
//                if(arr.get(i) - minData == 0){
//                    arr.remove(i);
//                    i--;
//                }
//            }
            arr = arr.stream().filter(a -> a - minData > 0).collect(Collectors.toList());
        }

        System.out.println(result);

    }
}
