package april_22;

public class CatAndAMouse {
    public static void main(String[] args) {
        // 고양이 2마리와 쥐의 거리를 확인하고 가까운 애가 잡는것
        // 둘의 거리가 같다면 고양이 끼리 싸운다.
        // 쥐 - 고1,   쥐 - 고2 의 절대값으로 비교해서 진행할것!
        int x = 1;
        int y = 2;
        int z = 3; // 쥐
        String result = "";
        int MC1Distance = Math.abs(z-x);
        int MC2Distance = Math.abs(z-y);

        if(MC1Distance == MC2Distance){
            result = "Mouse C";
        }else if(MC1Distance < MC2Distance){
            result = "Cat A";
        }else{
            result = "Cat B";
        }

        System.out.println(result);
    }
}
