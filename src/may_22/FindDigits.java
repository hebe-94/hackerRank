package may_22;

public class FindDigits {
    public static void main(String[] args) {
        int n = 1012;

        StringBuilder sb = new StringBuilder(Integer.toString(n));
        int result = 0;
        for (int i = 0; i < sb.length(); i++){
            int numData = Integer.parseInt(sb.charAt(i)+"");
            if(numData != 0 && n % numData == 0){
                result++;
            }
        }
        System.out.println(result);
    }
}
