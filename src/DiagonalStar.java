public class DiagonalStar {
    public static void printSquareStar(int num){
        if (num < 5){
            System.out.println("Invalid Value");
            return;
        }
        for(int i = 1; i <= num ; i++){
            for(int j = 1; j <=num ; j++){
                if(i == j || i == 1 || j == num || i == num || j == 1 || i + j == num + 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println("-------------");
        printSquareStar(8);
        String strNum = "123";
        System.out.println(Integer.parseInt(strNum));
    }
}
