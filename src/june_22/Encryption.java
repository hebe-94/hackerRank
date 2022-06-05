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

        String result = "";
        s = s.replace(" ", "");
        double strLenth = s.length();
        double strLenthFloor = Math.floor(Math.sqrt(strLenth)),strLenthCeil = Math.ceil(Math.sqrt(strLenth));
        double[] floorAr = {strLenthFloor,strLenthFloor,strLenthCeil, strLenthCeil};
        double[] ceilAr = {strLenthFloor,strLenthCeil,strLenthFloor, strLenthCeil};
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
        for(double i = strLenth; i % strLenthCeil != 0; i++){
            s += " ";
        }

        for(double i = 0.0; i < strLenthCeil; i++){
            for (double j = 0.0; j < strLenthFloor; j ++){
                if(s.charAt((int)(j*strLenthCeil+i)) == ' ')
                    break;
                result += s.charAt((int)(j*strLenthCeil+i));
            }
            result += " ";
        }











    }
}
