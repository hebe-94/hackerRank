import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,2,3,1,2));
        Collections.sort(a);
        int max = 0;
        int startIDX;

        for(int i = 0; i < a.size(); i++){
            startIDX = i;
            int pickNumber = a.get(startIDX);
            int numberLastIDX = a.lastIndexOf(pickNumber);
            int plusNumberLastIDX = a.lastIndexOf(pickNumber + 1);
            int temp = plusNumberLastIDX == -1? numberLastIDX - startIDX + 1: plusNumberLastIDX - startIDX + 1;

            if(max < temp){
                max = temp;
                i = plusNumberLastIDX == -1? numberLastIDX : plusNumberLastIDX;
            }
        }

        System.out.println(max);



    }
}
