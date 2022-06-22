package june_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeDSurfaceArea {
    public static void main(String[] args) {
        List<List<Integer>> A = new ArrayList<>();

        A.add(new ArrayList<>(Arrays.asList(1,3,4)));
        A.add(new ArrayList<>(Arrays.asList(2,2,3)));
        A.add(new ArrayList<>(Arrays.asList(1,2,4)));

        int row = A.size();
        int col = A.get(0).size();
        // 윗면 아래면
        int result = 2*row*col;


        for(int i=0;i<row;i++){
            result+=A.get(i).get(0)+A.get(i).get(col-1);
            for(int j=0;j<col-1;j++)
                result+=Math.abs(A.get(i).get(j)-A.get(i).get(j+1));
        }
        for(int j=0;j<col;j++){
            result+=A.get(0).get(j)+A.get(row-1).get(j);
            for(int i=0;i<row-1;i++)
                result+=Math.abs(A.get(i).get(j)-A.get(i+1).get(j));
        }
        System.out.println(result);
        // 가로
        // 1. 0이 아니면 그 값 더하기 2
        // 2. 다음 인덱스와의 차이를 절대값으로 더한다


        // 세로
    }
}
