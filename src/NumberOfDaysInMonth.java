public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        return LeapYear.isLeapYear(year);
    }
    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        else{
            if(isLeapYear(year) && month == 2){
                return 29;
            }
            else{
                return switch(month){
                    case 1,3,5,7,8,10,12 -> 31;
                    case 2 -> 28;
                    case 4,6,9,11 -> 30;
                    default -> -1;
                };
            }
        }
    }

}
