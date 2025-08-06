public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.printf("My pen length in centimeter %.2f%n",convertToCentimeters(8));
        System.out.printf("My height in centimeter %.2f%n" ,convertToCentimeters(6,0));
    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet,int inches){
        return convertToCentimeters((12 * feet) + inches);
    }
}

