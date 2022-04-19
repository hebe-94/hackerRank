import java.util.*;

public class ClimbingTheLeaderBoard {
    public static void main(String[] args) {
        ArrayList<Integer> ranked = new ArrayList<>(Arrays.asList(100,90,90,80,75,60));
        ArrayList<Integer> player = new ArrayList<>(Arrays.asList(50,65,77,90,102));
        List<Integer> result = new ArrayList<>();

        int scoreIDX = 0;
        int rankcount;
        while(player.size() > 0){
            if(player.remove(scoreIDX) > ranked.get(i)){
                // 50점 6등까지 있고 index = i(5)
                // 지금 들어가는게 7등

                // 65점 7등까지 있고 index =

            }
        }




//        HashSet<Integer> deleteOverlapRanked = new HashSet<>(ranked);
//        ranked = new ArrayList<>(deleteOverlapRanked);
//        Collections.sort(ranked,Collections.reverseOrder());
//
//        List<Integer> result = new ArrayList<>();
//
//        for(int i = 0; i<player.size(); i++){
//            int val = player.get(i);
//            ranked.add(val);
//            Collections.sort(ranked,Collections.reverseOrder());
//            result.add(ranked.indexOf(val)+1);
//        }
//
//        System.out.println(result);
    }
}
