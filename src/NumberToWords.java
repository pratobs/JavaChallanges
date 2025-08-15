public class NumberToWords {
        public static void numberToWords (int num){
            if(num < 0){
                System.out.println("Invalid Value");
                return;
            }
            if (num == 0 ){
                System.out.println("Zero");
                return;
            }
            var tempNum = num;
            num = reverse(num);
            while (num != 0) {
                var lastDigit = num % 10;
                switch (lastDigit){
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                    case 0 -> System.out.println("Zero");
                }
                num /= 10;
            }
            var diff = getDigitCount(tempNum) - getDigitCount(reverse(tempNum));
            while (diff > 0){
                System.out.println("Zero");
                diff--;
            }

        }
        public static int reverse(int num){
            var reversedNum = 0;
            while (num != 0) {
                var lastDigit = num % 10;
                reversedNum = reversedNum * 10 + lastDigit;
                num /= 10;
            }
            return reversedNum;
        }

        public static int getDigitCount(int num){
            if(num < 0){
                return -1;
            }
            if(num == 0){
                return 1;
            }
            var counter = 0;
            while (num != 0) {
                var lastDigit = num % 10;
                num /= 10;
                counter += 1;
            }
            return counter;
        }
    public static void main(String[] args) {
//        numberToWords(123);
        numberToWords(0);

    }
}
