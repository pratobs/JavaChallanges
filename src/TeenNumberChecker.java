public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        return (a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20);
    }
    public static boolean isTeen(int a) {
        return (a > 12 && a < 20) ;
    }
    public static void main(String[] args) {
        System.out.println(hasTeen(22, 23, 34));
    }
}


