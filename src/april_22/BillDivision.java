package april_22;

import java.util.ArrayList;
import java.util.Arrays;

public class BillDivision {
    public static void main(String[] args) {
        ArrayList<Integer> bill = new ArrayList<>(Arrays.asList(3,10,2,9));
        // 먹지 않은 인덱스
        int k = 1;
        // 받은돈
        int b = 12;
        // 결국 받은돈과 내야하는 돈의 차이를 비교해서
        // 제대로 줬는지 아닌지 판단


        int sum = 0;
        String result = "Bon Appetit";

        long startTime, endTime;

        // ver1
        startTime = System.nanoTime();
        for(int i = 0; i< bill.size(); i++){
            if(i == k){
                continue;
            }
            sum += bill.get(i);
        }
        if(sum/2 != b){
            result = (b - sum/2) + "";
        }
        System.out.println(result);
        endTime = System.nanoTime();
        System.out.println("걸린시간 : " + (endTime - startTime));

        sum=0;
        startTime = System.nanoTime();


        // ver2
        for(Integer price : bill){
            sum += price;
        }

        if((sum-bill.get(k))/2 != b){
            result = b - (sum-bill.get(k))/2 + "";
        }

        System.out.println(result);

        endTime = System.nanoTime();
        System.out.println("걸린시간 : " + (endTime - startTime));
    }
}
