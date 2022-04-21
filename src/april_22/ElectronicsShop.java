package april_22;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyboards = {3,1};
        int[] drives = {5,2,8};
        int b =10;

        int max = 0;
        int sum = 0;
        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < drives.length; j++){
                sum = keyboards[i] + drives[j];
                if(sum > max && sum <= b){
                    max = sum;
                }
            }
        }
        if(max > b){
            max = -1;
        }

        System.out.println(max);




//        while(result != -1){
//            if(keyboardsIndex != 0){
//                keyboardsIndex--;
//                price = keyboards[keyboardsIndex]+ drives[drivesIndex];
//            }
//
//            if(price < b){
//                result = price;
//                break;
//            }
//
//            if(drivesIndex != 0){
//                drivesIndex--;
//                price = keyboards[keyboardsIndex]+ drives[drivesIndex];
//            }
//
//            if(price < b){
//                result = price;
//                break;
//            }
//        }
    }
}
