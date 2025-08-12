public class Sum3and5Challenge {
    public static void main(String[] args) {
        var sum = 0;
        var counter = 1;
        for (int num = 1; num <= 1000 && counter < 5; num++) {
            if(num % 3 == 0 && num % 5 == 0){
                sum += num;
                counter++;
                System.out.println("THIS NUMBER MET THE CRITERIA: " + num);
            }
        }
        System.out.println("The total sum is " + sum);
    }
}
