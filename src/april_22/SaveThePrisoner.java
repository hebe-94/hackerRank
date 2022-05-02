package april_22;

public class SaveThePrisoner {
    public static void main(String[] args) {
        int n = 3; // 죄수 수
        int m = 7; // 사탕 개수
        int s = 3; // 시작 의자

        // m % n 로테이션이 돌고 남은 개수 ( n개 이하)
        // 남은개수 + 의자 개수 (현재 위치는 받은 사람이므로 한개 빼기
        // 그것을 나머지를 찾아야 하지만 0~n-1이 아닌 1 ~ n까지이므로 n+1로 모듈레이션
        int result = (m % n + s -1) % n;
        result = result == 0? n: result;
        System.out.println(result);
        // 7명 7개 1번부터 시작    결과 7  7 % 7 = 0 + 1 = 1 + 6
        // 7명 9개 1번부터 시작    결과 2  6+1  7 - 1 + 1

        // 사탕 개수 % 죄수 수  나머지가 0이면 현재 위치 뒷자리
        // 나머지가 1일때 시작의자 0이면 이전의자
        // 시작의자 3 1 2 3 1 2 3
        //        2 3 1 2 3 1 2
        //
    }
}
