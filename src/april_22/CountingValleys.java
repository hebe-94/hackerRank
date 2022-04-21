package april_22;

public class CountingValleys {
    public static void main(String[] args) {

        String path = "DDUUDDUDUUUD";
        int steps = path.length();
        int stepCNT = 0;
        int enterCNT = 0;
        for(int i =0; i<steps; i++){
            if( path.charAt(i) == 'U'){
                stepCNT ++;
                if(stepCNT == 0){
                    enterCNT++;
                }
            }else{
                stepCNT--;
            }
        }

        System.out.println(enterCNT);
    }
}
