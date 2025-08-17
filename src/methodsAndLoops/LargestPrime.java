package methodsAndLoops;

public class LargestPrime {
    public static int getLargestPrime (int num){
        var largePrimeNumber = num;

        if(num <= 0){
            return -1;
        }
        for(int i = 2; i <= num/2 ; i++){
            var isPrime = true;
            for(int j = 2; j <= i/2 ; j++){

                if(i%j == 0){
                    isPrime =false;
                }
            }
            if(isPrime && num % i == 0 ) {
                largePrimeNumber = i; // )
            }
        }
        return largePrimeNumber;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (-1));
        System.out.println(getLargestPrime (48));
        System.out.println(getLargestPrime (31));

    }
}
