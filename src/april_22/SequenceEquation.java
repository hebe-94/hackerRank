package april_22;

import java.util.ArrayList;
import java.util.Arrays;

public class SequenceEquation {
    public static void main(String[] args) {
        ArrayList<Integer> p = new ArrayList<>(Arrays.asList(4,3,5,1,2));
        ArrayList<Integer> result = new ArrayList<>();

        for(Integer data : p){
            result.add(p.indexOf(p.indexOf(p.indexOf(data)+1)+1)+1);
        }

        System.out.println(result);

    }
}
