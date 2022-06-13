package june_22;

public class Encryption {
    public static void main(String[] args) {
//        String s = "if man was meant to stay on the ground god would have given us roots";
//        String s = "haveaniceday";
//        String s = "feedthedog    ";
//        String s = "iffactsdontfittotheorychangethefacts";
        String s = "chillout";

        // 쪼개는 순서 정하기
//        String result = "";
//        s = s.replace(" ", "");
//        System.out.println(s);
//        double strLenth = s.length();
//        double strLenthFloor = Math.floor(Math.sqrt(strLenth)),strLenthCeil = Math.ceil(Math.sqrt(strLenth));
//        double[] floorAr = {strLenthFloor,strLenthFloor,strLenthCeil, strLenthCeil};
//        double[] ceilAr = {strLenthFloor,strLenthCeil,strLenthFloor, strLenthCeil};
//        for(int i = 0; i< floorAr.length; i++){
//            System.out.print(floorAr[i] + " ");
//        }
//        System.out.println();
//        for(int i = 0; i< floorAr.length; i++){
//            System.out.print(ceilAr[i] + " ");
//        }
//        double min = strLenth;
//        int index = -1;
//        for (int i = 0; i < floorAr.length; i++){
//            if(floorAr[i] * ceilAr[i] >= strLenth){
//                if(min > Math.abs(strLenth - floorAr[i] * ceilAr[i])){
//                    index = i;
//                    min = Math.abs(strLenth - floorAr[i] * ceilAr[i]);
//                }
//            }
//        }
//        System.out.println(index);
//        strLenthFloor = floorAr[index];
//        strLenthCeil = ceilAr[index];
//
//        System.out.println("length : " + strLenth);
//        System.out.println("floor : " +strLenthFloor);
//        System.out.println("ceil : " +strLenthCeil);
//
//        System.out.println(strLenth % strLenthCeil);
//        for(double i = strLenth; i % strLenthCeil != 0; i++){
//            s += " ";
//        }
//        System.out.println();
//
//        // floor줄, ceil칸
//        for(double i = 0.0; i < strLenthCeil; i++){
////            System.out.println(i);
//            for (double j = 0.0; j < strLenthFloor; j ++){
//                if(s.charAt((int)(j*strLenthCeil+i)) == ' ')
//                    break;
//                result += s.charAt((int)(j*strLenthCeil+i));
//            }
//            result += " ";
//        }
//
//        System.out.println(result);

        // have a nice day (12) 3,3 / 3,4 / 4,4 단, row가 col보다 작거나 같아야함
        // 3 row, 4col
        // have
        // anic
        // eday

        // 각 행의 특정 열을 골라내기, 골라낸 후에는 띄어쓰기
        // hae and via ecy

        String result = "";
        s = s.replace(" ", "");
        double strLenth = s.length();
        double strLenthFloor = Math.floor(Math.sqrt(strLenth)),strLenthCeil = Math.ceil(Math.sqrt(strLenth));
        double[] floorAr = {strLenthFloor,strLenthFloor,strLenthCeil, strLenthCeil};
        double[] ceilAr = {strLenthFloor,strLenthCeil,strLenthFloor, strLenthCeil};
        // floor, ceil 구하기
        double min = strLenth;
        int index = -1;
        for (int i = 0; i < floorAr.length; i++){
            if(floorAr[i] * ceilAr[i] >= strLenth){
                if(min > Math.abs(strLenth - floorAr[i] * ceilAr[i])){
                    index = i;
                    min = Math.abs(strLenth - floorAr[i] * ceilAr[i]);
                }
            }
        }
        strLenthCeil = ceilAr[index];
        strLenthFloor = floorAr[index];
        // 최소의 floor ceil 구하기
        for(double i = strLenth; i % strLenthCeil != 0; i++){
            s += " ";
        }
        // 배열 인덱스 문제를 사전에 방지하기 위해 띄어쓰기 추가

        for(double i = 0.0; i < strLenthCeil; i++){
            for (double j = 0.0; j < strLenthFloor; j ++){
                if(s.charAt((int)(j*strLenthCeil+i)) == ' ')
                    break;
                result += s.charAt((int)(j*strLenthCeil+i));
            }
            result += " ";
        }
        // 배열을 인덱스를 위한 띄어쓰기를 제외하고 각 배열에 맞게 result에 담기


        System.out.println(result);

        // 아 나는 또 올린다







    }
}
