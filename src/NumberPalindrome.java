public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0){
            number *= -1;
        }
        var copyNumber = number;
        var reverseNumber = 0;
        while(number>0){
            reverseNumber=reverseNumber*10+number%10;
            number/=10;
        }
        System.out.println("This is a reverse number: "+reverseNumber);
        return copyNumber == reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
}
