public class FirstLastDigitSum {
        public static int sumFirstAndLastDigit (int num){
            if (num < 0){
                return -1;
            }
            if( num <= 9){
                return num*2;
            }
            var lastDigit = num % 10;
            int firstDigit = 0;
            while(true){
                num = num / 10;
                if(num <= 9){
                    firstDigit = num ;
                    break;
                }
            }
            System.out.println("first digit is "+ firstDigit + " last digit is "+ lastDigit);
            return firstDigit + lastDigit;
        }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit (5));
    }
}
