package april_22;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int k = 3;

        int cLength = c.length;
        int idx = 0;
        int energy = 100;
        do{
            idx = (idx + k) % cLength;
            if(c[idx] == 1){
                energy -= 3;
            }else{
                energy--;
            }
        }while(idx % cLength != 0);

        System.out.println(energy);
    }
}
