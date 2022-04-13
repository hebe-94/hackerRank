import java.util.Arrays;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyboards = {3,1};
        int[] drives = {5,2,8};
        int b =10;
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int result = 0;
        int keyboardsIndex = keyboards.length-1;
        int drivesIndex = drives.length-1;

        if( b < keyboards[0] + drives[0]){
            result = -1;
        }

        int price = keyboards[keyboardsIndex] + drives[drivesIndex];

        while(result != -1){
            if(price > b){
                int keyboardDownPrice = keyboards[keyboardsIndex - 1]
            }

        }

        System.out.println(result);
    }
}
