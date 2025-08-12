public class SumOddRange {
    public static void main(String[] args) {
        for(int a = -10; a <= 100; a++){
            if(isOdd(a)){
                System.out.println("This is a odd number: " + a);
            }
        }
    }
    public static boolean isOdd(int num) {
        if(num <= 0){
            return false;
        }else {
            return !(num % 2 == 0);
        }
    }
    public static int sumOdd (int start, int end) {
        if(start > end || end < 0 || start < 0){
            return -1;
        }
        var sum = 0;
        for(int a = start; a <= end; a++){
            if(isOdd(a)){
                sum += a;
            }
        }
        return sum;
    }
}
