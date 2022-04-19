import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingTheLeaderBoard {
    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>(Arrays.asList(100,100,50,40,40,20,10));
        List<Integer> player = new ArrayList<>(Arrays.asList(5,25,50,120));
        List<Integer> result = new ArrayList<>();

        ranked = ranked.stream().distinct().collect(Collectors.toList());
        sort(ranked,0,ranked.size()-1);
        System.out.println(ranked);

        int rankedSize = ranked.size();

        for(int i =0; i<player.size(); i++){
            if(ranked.get(0) >= player.get(i)){
                result.add(rankedSize + 1);
            }else if(ranked.get(rankedSize-1) <= player.get(i)){
                result.add(1);
            }else{
                List<Integer> checkList = new ArrayList<>(ranked);
                if(checkList.contains(player.get(i))){
                    result.add(checkList.size() - checkList.lastIndexOf(player.get(i)));
                }else{
                    checkList.add(player.get(i));
                    sort(checkList,0,checkList.size()-1);
                    result.add(checkList.size() - checkList.lastIndexOf(player.get(i)));
                }
            }
        }




















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
        for(Integer data: result){
            System.out.println(data);
        }

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
