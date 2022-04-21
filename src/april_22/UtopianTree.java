package april_22;

public class UtopianTree {
    public static void main(String[] args) {
        int h = 1;
        int n = 4;

        for(int i = 1; i <= n; i++){
            h += i % 2 == 0 ? 1 : h;
            System.out.println(h);
        }

        System.out.println("최종 : " + h);
    }
}
