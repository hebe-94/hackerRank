package april_22;

import java.util.ArrayList;
import java.util.Arrays;

public class circularArrayRotation {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> queries = new ArrayList<>(Arrays.asList(0,1,2));
        int k = 2;

        ArrayList<Integer> result = new ArrayList<>();

        int arQueriesSize = queries.size();
        int arSize = a.size();

        for(int i=0; i<k; i++){
            a.add(0, a.remove(arSize -1));
        }

//        System.out.println(a);

        for(int i = 0; i< arQueriesSize; i++){
            result.add(a.get(queries.get(i)));
        }

//        System.out.println(result);
    }
}
