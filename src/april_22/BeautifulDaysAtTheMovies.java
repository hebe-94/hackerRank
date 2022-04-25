package april_22;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        int i = 20;
        int j = 23;
        int k = 6;

        int result = 0;
        for(int day = i; day <= j; day++){
            int reverseInt = Integer.parseInt(new StringBuffer(Integer.toString(day)).reverse().toString());
            System.out.println(reverseInt);
            if((day - reverseInt) % k == 0 ){
                result++;
            }
        }
    }
}
