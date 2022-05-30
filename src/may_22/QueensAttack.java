package may_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensAttack {
    public static void main(String[] args) {
        int n = 4; // 체스판 넓이
        int k = 0; // 장애물 수
        int r_q = 4; // 퀸의 가로, x
        int c_q = 4; // 퀸의 세로, y (r, c)
        List<List<Integer>> obstacles = new ArrayList<>();
        for(int i = 0; i< 4; i++){
            obstacles.add(Arrays.asList(0,0,0,0));
        }

        int[][] moveArr = {
                {0, 1}, {1, 1},
                {1, 0}, {1, -1},
                {0, -1}, {-1,-1},
                {-1, 0}, {-1, 1}
        };

        for(int i = 0; i < 9; i++){
            // 현재 위치에서 i,0  i,1을 x와 y에 더하기
            // r_q + i,0   c_q + i,1 반복
            // 반복 조건은 둘중 하나가 n과 같거나 크고, 그 값이 1일때 반복문 넘어가기
            // 0,0 0,1
            // 1,0 1,1
            // 2,0 2,1
            // 3,0 3,1
            // queen의 현재 위치에서 그 값을 계속 더하고 장애물이나 범위가 넘기전까지

        }
        for(int i = 0; i < n; i++){
            System.out.println(obstacles.get(i));
        }





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
