package may_22;

public class LibraryFine {
    public static void main(String[] args) {
        int d1 = 9, m1 = 6,  y1 = 2015, d2 = 6, m2 = 6, y2 = 2015;


        int result = 0;

        if( y1 > y2){
            result = 10000;
        }
        if (y1 == y2){
            if( m1 > m2){
                result = (m1 - m2) * 500;
            }else{
                if(m1 == m2 && d1 > d2){
                    result = (d1 - d2) * 15;
                }
            }
        }


//        int result = 0;
//
//        if( y1 > y2){
//            result = 10000;
//        }
//        if (y1 == y2){
//            if( m1 > m2){
//                result = (m1 - m2) * 500;
//            }else{
//                if(m1 >= m2 && d1 > d2){
//                    result = (d1 - d2) * 15;
//                }
//            }
//        }

        System.out.println(result);
    }
}
