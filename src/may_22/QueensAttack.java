package may_22;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensAttack {
    public static void main(String[] args) {
        int n = 5; // 체스판 넓이
        int k = 3; // 장애물 수
        int r_q = 4; // 퀸의 가로, x
        int c_q = 3; // 퀸의 세로, y (r, c)

        List<List<Integer>> obstacles = new ArrayList<>();
        obstacles.add(Arrays.asList(5,5));
        obstacles.add(Arrays.asList(4,3));
        obstacles.add(Arrays.asList(3,3));

        List<List<Integer>> chess = new ArrayList<>();
        for(int i = 0; i< n; i++){
            chess.add(new ArrayList<>());
            for(int j = 0; j< n; j++){
                    chess.get(i).add(0);
            }
        }



            // 현재 위치에서 i,0  i,1을 x와 y에 더하기
            // r_q + i,0   c_q + i,1 반복
            // 반복 조건은 둘중 하나가 n과 같거나 크고, 그 값이 1일때 반복문 넘어가기
            // 0,0 0,1
            // 1,0 1,1
            // 2,0 2,1
            // 3,0 3,1
            // queen의 현재 위치에서 그 값을 계속 더하고 장애물이나 범위가 넘기전까지

        int[][] moveArr = { // 상하, 좌우
                {0, 1}, {1, 1},
                {1, 0}, {1, -1},
                {0, -1}, {-1,-1},
                {-1, 0}, {-1, 1}
        };
        r_q--; c_q--;
        obstacles.get(r_q).set(c_q,1);


//        for(int i = obstacles.size()-1; i >= 0; i--){
//            System.out.println(obstacles.get(i));
//        }
        if(n == 1) System.out.println("0");
        int result = 0;
        for(int i = 0; i < 8; i++){
            int c = c_q;
            int r = r_q;
            int j = 0;
            while(!(r + moveArr[i][0] >= n || c + moveArr[i][1] >= n ||
                    r + moveArr[i][0] < 0 || c + moveArr[i][1] < 0)){
                if(r != obstacles.get(j).get(0) && c != obstacles.get(j).get(1)){
                    result++;
                    r += moveArr[i][0];
                    c += moveArr[i][1];
                    System.out.println("r :" + r);
                    System.out.println("c :" + c);
                    obstacles.get(r).set(c,3);
                    try {
//                        Thread.sleep(1500);
                    }catch (Exception e){

                    }
                    System.out.println();
                    for(int ii = obstacles.size()-1; ii >= 0; ii--){
                        System.out.println(obstacles.get(ii));
                    }
                    System.out.println();
                }

            }
        }

        System.out.println(result);





        // 0,1
        // 1,1
        // 1,0
        // 1,-1
        // 0, -1
        // -1,-1
        // -1,0
        // -1,1


    }
}
