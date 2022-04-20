import java.util.*;
import java.util.stream.Collectors;

public class ClimbingTheLeaderBoard {
    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>(Arrays.asList(997, 988, 981, 966, 957, 937, 933, 930, 929, 928, 927, 926, 922, 920, 916, 915, 903, 896, 887, 874, 872, 866, 863, 863, 860, 859, 858, 857, 857, 847, 847, 842, 830, 819, 815, 809, 803, 797, 796, 794, 794, 789, 785, 783, 778, 772, 765, 765, 764, 757, 755, 751, 744, 740, 737, 733, 730, 730, 724, 716, 710, 709, 691, 690, 684, 677, 676, 653, 652, 650, 625, 620, 619, 602, 587, 587, 585, 583, 571, 568, 568, 556, 552, 546, 541, 540, 538, 531, 530, 529, 527, 506, 504, 501, 498, 493, 493, 492, 489, 482, 475, 468, 457, 452, 445, 442, 441, 438, 435, 435, 433, 430, 429, 427, 422, 422, 414, 408, 404, 400, 396, 394, 387, 384, 380, 379, 374, 371, 369, 369, 369, 368, 366, 365, 363, 354, 351, 341, 337, 336, 328, 325, 318, 316, 314, 307, 306, 302, 287, 282, 281, 277, 276, 271, 246, 238, 236, 230, 229, 229, 228, 227, 220, 212, 199, 194, 179, 173, 171, 168, 150, 144, 136, 125, 125, 124, 122, 118, 98, 98, 95, 92, 88, 85, 70, 68, 61, 60, 59, 44, 43, 35, 32, 30, 28, 23, 20, 13, 12, 12));
        List<Integer> player = new ArrayList<>(Arrays.asList(83, 129, 140, 184, 198, 300, 312, 325, 341, 344, 349, 356, 370, 405, 423, 444, 465, 471, 491, 500, 506, 508, 539, 543, 569, 591, 607, 612, 614, 623, 645, 670, 689, 726, 744, 747, 764, 773, 777, 787, 805, 811, 819, 829, 841, 905, 918, 918, 955, 997));
        List<Integer> result = new ArrayList<>();

        TreeSet<Integer> treeSet = new TreeSet<>(ranked);
        ranked = new ArrayList<>(treeSet);
        System.out.println(ranked);
        System.out.println(player);

        int rankedSize = ranked.size();
        int rankIDX = 0;
        for(int i =0; i<player.size(); i++){
            // min
            if(ranked.get(0) > player.get(i)){
                result.add(rankedSize + 1);
                continue;
            }

            // 여기만 수정
            boolean flag = false;
            for(; rankIDX < rankedSize;){
                if(ranked.get(rankIDX) > player.get(i)){
//                    if(rankIDX > 0){
//                        System.out.println(player.get(i) + "은 " + ranked.get(rankIDX-1) + "보다 크고 : " + ranked.get(rankIDX) + "보다 작다 : " + (rankedSize - rankIDX - 1));
//                    }else{
//                        System.out.println(player.get(i) + "은 " + ranked.get(rankIDX) + "보다 작다 : " + (rankedSize - rankIDX - 1));
//                    }
                    System.out.println( player.get(i) + " 들어옴1");
                    result.add(rankedSize - rankIDX + 1);
                    flag = true;
                    break;
                }else if(ranked.get(rankIDX) == player.get(i)){
//                    System.out.println(player.get(i) + "은 " + ranked.get(rankIDX) + "와 같다 : " + (rankedSize - rankIDX - 1));
//                    System.out.println( player.get(i) + " 들어옴2");
                    result.add(rankedSize - rankIDX);
                    flag = true;
                    break;
                }else{
                    rankIDX++;
                }
            }

            if(flag) {
                continue;
            }
            //max
            if(ranked.get(rankedSize-1) < player.get(i)){
                result.add(1);
            }
        }














//        int playerIDX = 0;
//        for(int i = ranked.size() -1; i > 0; i--){
//            int playerScore = player.get(playerIDX);
//            int rankScore = ranked.get(i);
//            if(playerScore < rankScore){
//                result.add(i+2);
//                playerIDX++;
//            }else if(playerScore == rankScore){
//                result.add(i+1);
//                playerIDX++;
//            }
//        }
//        for(int i =playerIDX; i <player.size();i++){
//            System.out.println(player.get(i) + " : " + (1));
//            result.add(1);
//
//        }

        for(Integer data : result){
            System.out.println(data);
        }
        //큰수 -> 작은수
        // 10 20 40 50 100
        // 5 25 50 120





















//        ranked = ranked.stream().distinct().collect(Collectors.toList());
//        sort(ranked,0,ranked.size()-1);
//        System.out.println(ranked);
//
//        int rankedSize = ranked.size();
//
//        for(int i =0; i<player.size(); i++){
//            if(ranked.get(0) >= player.get(i)){
//                result.add(rankedSize + 1);
//            }else if(ranked.get(rankedSize-1) <= player.get(i)){
//                result.add(1);
//            }else{
//                List<Integer> checkList = new ArrayList<>(ranked);
//                if(checkList.contains(player.get(i))){
//                    result.add(checkList.size() - checkList.lastIndexOf(player.get(i)));
//                }else{
//                    checkList.add(player.get(i));
//                    sort(checkList,0,checkList.size()-1);
//                    result.add(checkList.size() - checkList.lastIndexOf(player.get(i)));
//                }
//            }
//        }




















//        ranked = ranked.stream().distinct().collect(Collectors.toList());
//        sort(ranked,0,ranked.size()-1);
//        System.out.println(ranked);
//
//        int rankedSize = ranked.size();
//
//        for(int i =0; i<player.size(); i++){
//            if(ranked.get(rankedSize-1) <= player.get(i)  ){
//                System.out.println(player.get(i)+ " 점은 : " + 1 + "등");
////                result.add(1);
//            }else if(ranked.get(0) >= player.get(i)){
//                System.out.println(player.get(i)+ " 점은 : " + (ranked.size() + 1) + "등");
////                result.add(rankedSize + 1);
//            }else{
//                List<Integer> checkList = new ArrayList<>(ranked);
//                checkList.add(player.get(i));
//                checkList = checkList.stream().distinct().collect(Collectors.toList());
//                sort(checkList,0,checkList.size()-1);
//                System.out.println(player.get(i) + "점은 : "+ (checkList.size() - checkList.indexOf(player.get(i))) );
//                result.add(checkList.size() - checkList.indexOf(player.get(i)));
////                for(int j = 0; j<rankedSize; j++){ // ranked 10 20 40 50 100
////                    if(player.get(i) < ranked.get(j)){  // 25  40
////                        System.out.println(player.get(i) + "점은 " + ranked.get(j) + "값보다 조금 작거나 같다");
////                        System.out.println(player.get(i) + "점은 : " + (rankedSize - j + 1) + "등");
//////                        result.add(rankedSize - j + 1);
////                        break;
////                    }
////                }
//            }
//        }








































//        List<Integer> addRanked = ranked;
//
//        HashSet<Integer> intSet = new HashSet<>(ranked);
//        ranked = new ArrayList<>(intSet);
//        sort(ranked,0,ranked.size()-1);
////        for(Integer data : ranked){
////            System.out.println(data);
////        }
//        System.out.println("////////////////////////////////////////");
//            // 60 70 80 90
//        int rankedSize = ranked.size();
//        for(int i =0; i<player.size(); i++){
//            if(ranked.get(0) >player.get(i)){
////                System.out.println(player.get(i)+ " 점은 : " + (ranked.size() + 1) + "등");
//                result.add(rankedSize + 1);
//            }else if(ranked.get(rankedSize-1) < player.get(i)){
////                System.out.println(player.get(i)+ " 점은 : " + 1 + "등");
//                result.add(1);
//            }else{
//
//            }
//        }





























//        for(int i =0; i<player.size(); i++){
//            addRanked.add(player.get(i));
//            sort(addRanked,0,addRanked.size()-1);
//            result.add(addRanked.size() - addRanked.indexOf(player.get(i)));
//            addRanked = ranked;
//        }




//        HashSet<Integer> deleteOverlapRanked = new HashSet<>(ranked);
//        TreeSet<Integer> deleteOverlapRanked = new TreeSet<>(ranked);
//        ranked = new ArrayList<>(deleteOverlapRanked);
//        int rank = deleteOverlapRanked.size() + 1;
//        int index = 0;

//        Iterator<Integer> rankIterator = deleteOverlapRanked.iterator(); // 10 20 30 40
//        while(rankIterator.hasNext()){
//            int iteraterData = rankIterator.next();
////            System.out.println(iteraterData);
//            if(iteraterData > player.get(index)){
//                System.out.println(iteraterData + " > " + player.remove(index) + " : " + rank);
//                result.add(rank);
//            }
//            rank--;
//        }
//
//        for(int i = 0; i < player.size(); i++){
////            System.out.println("나머지 리스트 사이즈 : " + player.size());
//            System.out.println(player.get(i) + " : " + rank--);
//        }

//        10 20 40 50 100




//        int rank = 1;
//        for(int i = 0; i<player.size(); i++){
//            for (int j =1; j<ranked.size(); j++){
//                if(player.get(i) < ranked.get(j)){
//                    rank++;
//                    if(ranked.get(j-1) == ranked.get(j)){
//                        rank--;
//                    }
//                    if(ranked.get(ranked.size()-1) > player.get(i)){
//                        result.add(rank);
//                        rank = 0;
//                    }
//                }else {
//                    result.add(rank);
//                    rank = 0;
//                    break;
//                }
//            }
//
//        }
//        for(Integer data: result){
//            System.out.println(data);
//        }

        // 이전값과 현재값이 같으면 랭크를 하나 줄이기


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

        // 100,90,90,80,75,60
        // 50점 6등까지 있고 60점을 가리키고 뒤에 index = 5
        // 지금 들어가는게 7등

        // 100,90,90,80,75,60,50
        // 65점 7등까지 있고 75점을 가리키고 뒤에 index = 4
        // 지금 들어가는게 6등

    }

    public static void sort(List<Integer> data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data.get((l+r)/2);

        do{
            while(data.get(left) < pivot) left++;
            while(data.get(right) > pivot) right--;
            if(left <= right){
                int temp = data.get(left);
                data.set(left,data.get(right));
                data.set(right,temp);
                left++;
                right--;
            }
        }while (left <= right);

        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }


}
