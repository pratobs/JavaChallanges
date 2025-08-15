public class EvenDigitSum {
    public static int getEvenDigitSum(int num){
        if(num < 0){
            return -1;
        }
        var sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum = digit % 2 == 0 ? sum + digit : sum;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(0));
        System.out.println(getEvenDigitSum(9));
        System.out.println(getEvenDigitSum(2));
        System.out.println(getEvenDigitSum(94));
        System.out.println(getEvenDigitSum(926));
        System.out.println(getEvenDigitSum(2224));
    }
}
