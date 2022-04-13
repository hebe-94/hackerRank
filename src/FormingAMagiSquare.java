import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FormingAMagiSquare {
    public static void main(String[] args) {
        List<Integer> i1 = new ArrayList<>(Arrays.asList(4,9,2));
        List<Integer> i2 = new ArrayList<>(Arrays.asList(3,5,7));
        List<Integer> i3 = new ArrayList<>(Arrays.asList(8,1,5));
        List<List<Integer>> s = new ArrayList<>();
        s.add(i1);
        s.add(i2);
        s.add(i3);
//        System.out.println(s.size());



        List<Integer> total = new ArrayList<>();
        total.addAll(i1);
        total.addAll(i2);
        total.addAll(i3);

        int result =0;

        List<Integer> overlapData = new ArrayList<>(); // 중복된 수
        List<Integer> checkData = new ArrayList<>(); // 필요한 숫자

//        System.out.println(total);
        for (int i=1; i<10; i++){
            if( Collections.frequency(total, i) > 1){
                overlapData.add(i);
            }
            if( Collections.frequency(total, i) == 0){
                checkData.add(i);
            }
        }

//        for (int i = 0; i<checkData.size(); i++){
//            result += Math.abs(checkData.get(i) - overlapData.get(i));
//        }

//        System.out.println(overlapData);
//        System.out.println(checkData);
        System.out.println(result);




    }
}
