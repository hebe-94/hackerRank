package june_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheGridSearch {
    public static void main(String[] args) {

//        List<String> G = new ArrayList<>(Arrays.asList("7283455864","6731158619","8988242643","3830589324","2229505813","5633845374","6473530293","7053106601","0834282956","4607924137"));
//        List<String> P = new ArrayList<>(Arrays.asList("9505","3845","3530"));
        List<String> G = new ArrayList<>(Arrays.asList("123412","561212","123634","781288"));
        List<String> P = new ArrayList<>(Arrays.asList("12","34"));
//        List<String> G = new ArrayList<>(Arrays.asList("400453592126560","114213133098692","474386082879648","522356951189169","887109450487496","252802633388782","502771484966748","075975207693780","511799789562806","404007454272504","549043809916080","962410809534811","445893523733475","768705303214174","650629270887160"));
//        List<String> P = new ArrayList<>(Arrays.asList("99","99"));
//        List<String> G = new ArrayList<>(Arrays.asList("1234","4321","9999","9999"));
//        List<String> P = new ArrayList<>(Arrays.asList("12","21"));
//        List<String> G = new ArrayList<>(Arrays.asList("7652157548860692421022503","9283597467877865303553675","4160389485250089289309493","2583470721457150497569300","3220130778636571709490905","3588873017660047694725749","9288991387848870159567061","4840101673383478700737237","8430916536880190158229898","8986106490042260460547150",
//                "2591460395957631878779378","1816190871689680423501920","0704047294563387014281341","8544774664056811258209321","9609294756392563447060526","0170173859593369054590795","6088985673796975810221577","7738800757919472437622349","5474120045253009653348388","3930491401877849249410013",
//                "1486477041403746396925337","2955579022827592919878713","2625547961868100985291514","3673299809851325174555652","4533398973801647859680907"));
//        List<String> P = new ArrayList<>(Arrays.asList("5250","1457","8636","7660","7848"));
        boolean errFlag = false;
        int i=0, j=0;
        for(i = 0; i <G.size(); i++){
            for (j = 0; j < G.get(i).length(); j++){
                if(G.get(i).charAt(j) == P.get(0).charAt(0)){
                    if(i + P.size() <= G.size() && j + P.get(0).length() <= G.get(0).length()){
                        System.out.println("index x : "+i +"  index y : " +j);
                        System.out.println();
                        errFlag = false;
                        for(int ii = 0; ii < P.size(); ii++){
                            for(int jj = 0; jj < P.get(0).length(); jj++){
                                System.out.println(P.get(ii).charAt(jj) + " = " + G.get(i+ii).charAt(j+jj));
                                if(G.get(i+ii).charAt(j+jj) != P.get(ii).charAt(jj)){
                                    errFlag = true;
                                    break;
                                }
                            }
                        }
                        if(!errFlag) {
                            System.out.println("찾았다.");
                        }

                    }
                }
            }
        }


    }
}
