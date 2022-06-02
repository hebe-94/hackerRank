package june_22;

public class taumAndBday {
    public static void main(String[] args) {
        long b = 27984l;
        long w = 1402l;
        long bc = 619246l;
        long wc = 15589l;
        long z = 247954l;


        long blackPrice = bc < (wc + z)? bc : (wc+z);
        long whitePrice = wc < (bc + z)? wc : (bc+z);
        long totalPrice = 0;


        System.out.println(b *blackPrice + w * whitePrice);


    }

}
