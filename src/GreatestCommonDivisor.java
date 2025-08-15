public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        var gcd  = 1;
        int divisor = 1;
        while (true){
            if(first % divisor == 0 && second % divisor == 0){
                gcd = divisor;
            }
            if(divisor == Math.min(first,second)){
                break;
            }
            divisor += 1;
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

}
