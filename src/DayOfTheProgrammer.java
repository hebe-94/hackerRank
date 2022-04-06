public class DayOfTheProgrammer {
    public static void main(String[] args) {
        // 1700 ~ 2700
        // 1917까지 율리우스력 그 이후 그레고리력
        int year = 1915;

        String result;
        // 1918년에는 1월 31일 다음이 2월 14일  (d+14)
        // 윤년이 아니므로 9월 12일 +14일  9월 26일
        if(year == 1918){
            result = "26.09.1918";

        // 1918년보다 작으면 400으로 나누어 떨어질때만 (율리우스력)
        }else if(year < 1918 && year % 4 == 0){
            result = "12.09." + year;

        // 1918년보다 크면 400으로 나누어 떨어지면서 4의배수, 100으로 안떨어지는(그래고리력)
        }else if(year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            result = "12.09." + year;
        }else{
            result = "13.09." + year;
        }

        System.out.println(result);

    }
}
