public class TheForLoopChallange {
    public static void main(String[] args) {
        printPrime(4,867);
    }
    public static boolean isPrime(int num){
        if(num <= 2){
            return num == 2;
        }
        for (int i = 2  ; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int start,int end){
        var count = 0;
        for (int i = start; i <= end; i++) {
            if(isPrime(i)){
                System.out.println(i + " is the Prime number ");
                count++;
                if(count == 3){
                    break;
                }
            }
        }
    }
}
