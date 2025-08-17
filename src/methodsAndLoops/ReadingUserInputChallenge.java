package methodsAndLoops;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static boolean checkValid(int number){
        return number > 0 ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int counter = 1;
        int sum = 0;
        do {
            System.out.print("Enter number #" +counter + ": ");
            number = Integer.parseInt(scanner.nextLine());
            System.out.println();
            if(checkValid(number)){
                counter++;
                sum += number;
            }else {
                System.out.println("Invalid Number");
            }
        }while (counter <=5);
        System.out.println("The total sum is: " + sum);
    }
}
