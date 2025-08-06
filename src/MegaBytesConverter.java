public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
            return;
        }
        int mb,kb;
        mb = kiloBytes/1024;
        kb = kiloBytes%1024;
        System.out.printf("%d KB = %d MB and %d KB%n",kiloBytes,mb,kb);
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
