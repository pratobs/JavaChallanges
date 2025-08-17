package methodsAndLoops;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE,number,counter = 0;
        while (true){
            System.out.println("Enter you number: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if(number >= max){
                    max = number;
                }
                if(number <= min){
                    min = number;
                }
                counter++;

            } catch (NumberFormatException e) {
                System.out.println("Please enter the valid number");
                break;
            }
        }
        if(counter == 1) {
            min = max;
            System.out.println("MAX: " + max + " MIN: " + min);
        }else {
            System.out.println("MAX: " + max + " MIN: " + min);
        }
    }
}
