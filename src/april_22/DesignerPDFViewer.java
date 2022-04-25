package april_22;

import java.util.ArrayList;
import java.util.Arrays;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        // a 97, z 122
        ArrayList<Integer> h = new ArrayList<>(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5));
        String word = "zava";

        int max = 0;
        for(int i = 0; i < word.length(); i++){
            int charIDX = (int)word.charAt(i) - 97;
            int charHeight = h.get(charIDX);
            if(max < charHeight){
                max = charHeight;
            }
        }

        System.out.println(max * word.length());
    }
}
