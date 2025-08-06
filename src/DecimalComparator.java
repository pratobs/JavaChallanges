public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        var intd1 = (int) (d1 * 1000.00);
        var intd2 = (int) (d2 * 1000.00);
        return intd1 == intd2;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
    }
}
