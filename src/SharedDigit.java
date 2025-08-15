import java.sql.SQLOutput;

public class SharedDigit {
    public static boolean hasSharedDigit(int num, int num2) {
        if (num < 10 || num2 < 10 || num > 99 || num2 > 99) {
            return false;
        }
        var temTemp2 = num2;
        for (int i = 1; i <= 2; i++) {
            var numDigit = num % 10;
            num2 = temTemp2;
            for (int j = 1; j <= 2; j++) {
                var num2Digit = num2 % 10;
                System.out.println(numDigit + " , " + num2Digit );
                if (numDigit == num2Digit) {
                    return true;
                }
                num2 = num2 / 10;
            }
            num = num / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
//        System.out.println(hasSharedDigit(9, 99));
//        System.out.println(hasSharedDigit(15, 55));
//        System.out.println(hasSharedDigit(51, 23));
//        System.out.println(hasSharedDigit(77, 77));
    }
}
