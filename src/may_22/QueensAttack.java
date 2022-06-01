package may_22;

import java.util.*;

public class QueensAttack {
    public static void main(String[] args) {
        int n = 5; // 체스판 넓이
        int k = 3; // 장애물 수
        int r_q = 4; // 퀸의 가로, x
        int c_q = 3; // 퀸의 세로, y (r, c)

//        int n = 4; // 체스판 넓이
//        int k = 0; // 장애물 수
//        int r_q = 4; // 퀸의 가로, x
//        int c_q = 4; // 퀸의 세로, y (r, c)

        List<List<Integer>> obstacles = new ArrayList<>();
        obstacles.add(Arrays.asList(5,5));
        obstacles.add(Arrays.asList(4,2));
        obstacles.add(Arrays.asList(2,3));

//        List<List<Integer>> chess = new ArrayList<>();
//        for(int i = 0; i< n; i++){
//            chess.add(new ArrayList<>());
//            for(int j = 0; j< n; j++){
//                    chess.get(i).add(0);
//            }
//        }

//        chess.get(r_q-1).set(c_q-1,1);  // 3 2
//        chess.get(4).set(4,2);
//        chess.get(3).set(1,2);
//        chess.get(1).set(2,2);
//        System.out.println("처음");
//        for(int ii = chess.size()-1; ii >= 0; ii--){
//            System.out.println(chess.get(ii));
//        }
        System.out.println();
        System.out.println();

//        for(int i = obstacles.size()-1; i >= 0; i--){
//            System.out.println(obstacles.get(i));
//        }


//        obstacles.add(Arrays.asList(5,5)); 4 4
//        obstacles.add(Arrays.asList(4,2)); 3 1
//        obstacles.add(Arrays.asList(2,3)); 1 2
        //////////////////////////////////////////////////////////////////////
//        int[][] moveArr = {
//                {0, 1}, {1, 1},
//                {1, 0}, {1, -1},
//                {0, -1}, {-1,-1},
//                {-1, 0}, {-1, 1}
//        };
//        r_q--; c_q--;
//        if(n == 1) System.out.println("0");
//        int result = 0;
//        for(int i = 0; i < 8; i++){
//            int c = c_q;
//            int r = r_q;
//            boolean flag = false;
//            while(!(r + moveArr[i][0] >= n || c + moveArr[i][1] >= n ||
//                    r + moveArr[i][0] < 0 || c + moveArr[i][1] < 0 || flag)){ // 한방향 끝까지
//
//                    r += moveArr[i][0];
//                    c += moveArr[i][1];
//                    for (int i1 = 0; i1 < k; i1++){
//                        if(obstacles.size() != 0 && r == obstacles.get(i1).get(0)-1 && c == obstacles.get(i1).get(1)-1){
//                            System.out.println("0000000000");
//                            flag = true;
//                            break;
//                        }
//                    }
//                    if(flag) break;
//                    result++;
//                    System.out.println("r :" + r);
//                    System.out.println("c :" + c);
//                    chess.get(r).set(c,3);
////                    try {
//////                        Thread.sleep(1500);
////                    }catch (Exception e){
////
////                    }
//                    System.out.println();
//                    for(int ii = chess.size()-1; ii >= 0; ii--){
//                        System.out.println(chess.get(ii));
//                    }
//                    System.out.println();
//
//
//            }
//        }
//
//        System.out.println(result);





//        int[][] moveArr = {
//                {0, 1}, {1, 1},
//                {1, 0}, {1, -1},
//                {0, -1}, {-1,-1},
//                {-1, 0}, {-1, 1}
//        };
//        System.out.println();
//        int result = 0;
//        for(int i = 0; i < 8; i++){
//            boolean flag = false;
//            int r = r_q + moveArr[i][0] -1;
//            int c = c_q + moveArr[i][1] -1;
//            while(r < n && c < n && r >= 0 && c >= 0){
//                for (int i1 = 0; i1 < obstacles.size(); i1++){
//                    if(r == obstacles.get(i1).get(0)-1 && c == obstacles.get(i1).get(1)-1){
//                        obstacles.remove(i1);
//                        flag = true;
//                        break;
//                    }
//                }
//                if(flag) break;
//                r += moveArr[i][0];
//                c += moveArr[i][1];
//                result++;
//            }
//        }
//        System.out.println(result);
        Map<String, String> obstacleMap= new HashMap<>();
        for(int i=0; i<k; i++) {
            obstacleMap.put((obstacles.get(i).get(0)-1) + "-" + (obstacles.get(i).get(1)-1), "obstacle");
        }

        int[][] moveArr = {
                {0, 1}, {1, 1},
                {1, 0}, {1, -1},
                {0, -1}, {-1,-1},
                {-1, 0}, {-1, 1}
        };
        int result = 0;
        int r = r_q--;
        int c = c_q--;
        for(int i = 0; i < 8; i++){
            while(true){
                r = r + moveArr[i][0];
                c = c + moveArr[i][1];
                System.out.println("loc : " +r + ", " + c);
                if(r >= n || c >= n || r < 0 || c < 0){
                    break;
                }
                String key = r + "-" + c;
                System.out.print("key : ");
                System.out.println(key);
                if(obstacleMap.containsKey(key)){
                    break;
                }
                result++;
            }
        }
        System.out.println(result);
    }
}
