public class PerfectNumber {
    public static boolean isPerfect(int num) {
        if(num <  1){
            return false;
        }
        var sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum == num;
    }

    public static boolean isPerfectNumber(int num) {
        if(num <  1){
            return false;
        }
        var sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
}
