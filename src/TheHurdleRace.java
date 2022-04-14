import java.util.*;

public class TheHurdleRace {
    public static void main(String[] args) {
        int k = 0;
        List<Integer> height = new ArrayList<>(Arrays.asList(4,9,2));

        int result = 0;
        int maxHeight = Collections.max(height);
        if(maxHeight > k){
            result = maxHeight - k;
        }

        System.out.println(result);
    }
}
