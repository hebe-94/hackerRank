import java.util.ArrayList;
import java.util.Arrays;

public class SalesByMatch {
    public static void main(String[] args) {
//        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,2,1,2,1,3,2));

        int n = ar.size();

        ////////////////////////////////////
        int socksCNT = 0;

        while(ar.size() != 0){
            int sock = ar.get(0);
            ar.remove(0);
            int index = ar.indexOf(sock);
            if(index != -1){
                ar.remove(index);
                socksCNT++;
            }
        }

        System.out.println(socksCNT);
    }
}
