package june_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrganizingContainersOfBalls {
    public static void main(String[] args) {
        List<List<Integer>> container = new ArrayList<>();
        container.add(new ArrayList<>(Arrays.asList(999336263, 998799923)));
        container.add(new ArrayList<>(Arrays.asList(998799923, 999763019)));
//        container.add(new ArrayList<>(Arrays.asList(2,0,0)));

        // 가로 합
        long[] rowCnt = new long[container.size()];
        // 세로 합
        long[] colCnt = new long[container.get(0).size()];

        for(int containerRow = 0; containerRow < container.size(); containerRow++){
            for(int eachCol = 0; eachCol < container.size(); eachCol++){
                rowCnt[containerRow] += (long)container.get(containerRow).get(eachCol);
            }
            for(int eachRow = 0; eachRow < container.size(); eachRow++){
                colCnt[containerRow] += (long)container.get(eachRow).get(containerRow);
            }
        }
        Arrays.sort(rowCnt);
        Arrays.sort(colCnt);

//        for (int i = 0; i < rowCnt.length; i++){
//            System.out.print(rowCnt[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < colCnt.length; i++){
//            System.out.print(colCnt[i] + " ");
//        }

        for (int i = 0; i < rowCnt.length; i++){
            if(rowCnt[i] != colCnt[i])
//                return "Impossible";
            System.out.println("impossible");
        }

//        return "Possible";
            System.out.println("possible");
    }
}
