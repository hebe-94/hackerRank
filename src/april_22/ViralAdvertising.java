package april_22;

public class ViralAdvertising {

    public static double sharedAdversting(int n, int loopNum, double sharedNum){
        if(loopNum == n){
            return Math.floor(sharedNum/2);
        }else{
            return Math.floor(sharedNum/2) + sharedAdversting(n+1,loopNum,Math.floor(sharedNum/2) * 3);
        }
    }

    public static void main(String[] args) {
        System.out.println(sharedAdversting(1,3, 5));
    }
}
