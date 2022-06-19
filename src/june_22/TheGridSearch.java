package june_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheGridSearch {
    public static void main(String[] args) {

        // String을 사용해야 하기 때문에 사용해야
//        char[][] arrOriginData = {
//                {'7','2','8','3','4','5','5','8','6','4'},
//                {'6','7','3','1','1','5','8','6','1','9'},
//                {'8','9','8','8','2','4','2','6','4','3'},
//                {'3','8','3','0','5','8',9,3,2,4},
//                {2,2,2,9,5,0,5,8,1,3},
//                {5,6,3,3,8,4,5,3,7,4},
//                {6,4,7,3,5,3,0,2,9,3},
//                {7,0,5,3,1,0,6,6,0,1},
//                {0,8,3,4,2,8,2,9,5,6},
//                {4,6,0,7,9,2,4,1,3,7}
//        };

//        char[][] arrSearchData = {
//                {9,5,0,5},
//                {3,8,4,5},
//                {3,5,3,0}
//        };

//        List<String> G = new ArrayList<>(Arrays.asList("7283455864","6731158619","8988242643","3830589324","2229505813","5633845374","6473530293","7053106601","0834282956","4607924137"));
//        List<String> P = new ArrayList<>(Arrays.asList("9505","3845","3530"));
//        List<String> G = new ArrayList<>(Arrays.asList("400453592126560","114213133098692","474386082879648","522356951189169","887109450487496","252802633388782","502771484966748","075975207693780","511799789562806","404007454272504","549043809916080","962410809534811","445893523733475","768705303214174","650629270887160"));
//        List<String> P = new ArrayList<>(Arrays.asList("99","99"));
        List<String> G = new ArrayList<>(Arrays.asList("1234","4321","9999","9999"));
        List<String> P = new ArrayList<>(Arrays.asList("12","21"));

        boolean errFlag = false;
        boolean findFlag = false;
        int i=0, j=0;
        for(i = 0; i <G.size(); i++){
            for (j = 0; j < G.get(i).length(); j++){
                if(G.get(i).charAt(j) == P.get(0).charAt(0)){
                    // 여기서 판단
                    if(i + P.size() < G.size() &&
                            j + P.get(0).length()< G.get(0).length()){
//                    System.out.println("찾았다!");
                        System.out.println("index x : "+i +"  index y : " +j);
                        System.out.println();
                        errFlag = false;
                        for(int ii = 0; ii < P.size(); ii++){
                            for(int jj = 0; jj < P.get(ii).length(); jj++){
                                System.out.println(P.get(ii).charAt(jj) + " = " + G.get(i+ii).charAt(j+jj));
                                if(P.get(ii).charAt(jj) != G.get(i+ii).charAt(j+jj)){
                                    errFlag = true;
                                    break;
                                }
                            }
                            if(errFlag){
                                break;
                            }
                            findFlag = true;
                        }
                        if(findFlag){
                            System.out.println("찾았다!");
                        }
                    }
                }
            }
        }


//        String result = "NO";
//        boolean findFlag = true;
//        int standardIndex = -1, equalIndex = -1;
//
//        for (int i = 0; i < G.size() - P.size(); i++){
//            findFlag = true;
//            if(G.get(i).contains(P.get(0))){
//                for(int j = 0; j < P.size() && findFlag; j++){
//                    if(standardIndex == -1){
//                        standardIndex = G.get(i+j).indexOf(P.get(j).charAt(0));
//                        equalIndex = G.get(i+j).indexOf(P.get(j).charAt(0));
//                    }else{
//                        equalIndex = G.get(i+j).indexOf(P.get(j).charAt(0));
//                    }
//                    if(!G.get(i+j).contains(P.get(j)) || standardIndex != equalIndex){
//                        findFlag = false;
//                        break;
//                    }
//                }
//                if(findFlag){
//                    result = "YES";
//                }
//            }
//        }
//        System.out.println(result);

    }
}
