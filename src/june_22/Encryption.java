package june_22;

public class Encryption {
    public static void main(String[] args) {
//        String s = "if man was meant to stay on the ground god would have given us roots";
//        String s = "haveaniceday";
//        String s = "feedthedog    ";
//        String s = "iffactsdontfittotheorychangethefacts";
        String s = "chillout";

        // 쪼개는 순서 정하기
        String result = "";
        s = s.replace(" ", "");
        System.out.println(s);
        double strLenth = s.length();
        double strLenthFloor = Math.floor(Math.sqrt(strLenth)),strLenthCeil = Math.ceil(Math.sqrt(strLenth));
        System.out.println("length : " + strLenth);
        System.out.println("floor : " +strLenthFloor);
        System.out.println("ceil : " +strLenthCeil);

        System.out.println(strLenth % strLenthCeil);
        for(double i = strLenth; i % strLenthCeil != 0; i++){
            s += " ";
        }
        System.out.println();

        // floor줄, ceil칸
        for(double i = 0.0; i < strLenthCeil; i++){
//            System.out.println(i);
            for (double j = 0.0; j < strLenthFloor; j ++){
                if(s.charAt((int)(j*strLenthCeil+i)) == ' ')
                    break;
                result += s.charAt((int)(j*strLenthCeil+i));
            }
            result += " ";
        }

        System.out.println(result);
    }
}
