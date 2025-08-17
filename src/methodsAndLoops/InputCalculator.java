package methodsAndLoops;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0, counter = 0;
        double avg = 0.0;
        while (true){
            try {
                int number = Integer.parseInt(scanner.nextLine());
                sum += number;
                counter++;

            } catch (NumberFormatException e) {
                if(counter == 0) {
                    avg = 0;
                }else{
                    avg = (double) sum / counter;
                }

                System.out.println("SUM = " + sum +" AVG = " +  Math.round((float) avg ));
                break;
            }
        }
    }

    public static void main(String[] args) {
        InputCalculator.inputThenPrintSumAndAverage();
    }
}
