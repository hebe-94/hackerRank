package april_22;

public class DrawingBook {
    public static void main(String[] args) {
        // 길이의 반을 쪼개서
        // 뒤가 편한지 앞이 편한지 판단
        int n = 6; // 전체 페이지 수
        int p = 2; // 요청 페이지 수

        if (p <= n/2){
            System.out.println("[정순] 횟수 : " + p/2);
            // 2 3 ...1  // 4 5 ...2
        }else{
            System.out.println("[역순] 횟수 : " + (n/2 - p/2));
            // 6 7 ...0 // 4 5 ...1
            //  3             2
            // 3 - 3          3 - 2
            // n/2 - p/2
        }
    }
}
