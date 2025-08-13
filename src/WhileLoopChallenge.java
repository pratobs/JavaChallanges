import javax.xml.transform.sax.SAXSource;

public class WhileLoopChallenge {
    public static boolean isEvenNumber (int number){
        return number % 2 == 0;
    }
    public static int sumDigits (int number){
        if(number < 0){
            return -1;
        }
        var str = (String.valueOf(number)).toCharArray();
        int total = 0;
        for( char s: str){
            total+=Character.getNumericValue(s);
        }
        return total;
    }

    public static void main(String[] args) {

        var number = 5;
        var evenCounter = 0;
        var oddCounter = 0;

        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println("This is the even number: "+number);
                evenCounter++;
            }else{
                oddCounter++;
            }
            number++;
            if (evenCounter == 5) {
                break;
            }
        }
        System.out.println("The even count: " +evenCounter);
        System.out.println("The odd count: " +oddCounter);
        System.out.println("The sum of the number 123: " + sumDigits(123));
    }
}
