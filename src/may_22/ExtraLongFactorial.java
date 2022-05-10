package may_22;

import java.math.BigInteger;

public class ExtraLongFactorial {
    public static void main(String[] args) {
        BigInteger factorialData = new BigInteger(5 +"");
        BigInteger multiplyData;
        for(int i = 5-1; i >0; i--){
            multiplyData = new BigInteger(i+"");
            factorialData = factorialData.multiply(multiplyData);
        }
        System.out.println(factorialData.toString());
    }
}
