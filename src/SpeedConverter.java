public class SpeedConverter {
    public static  long toMilesPerHour(double kilometersPerHour){
        var res = -1.00d;
        if(kilometersPerHour>=0){
            res = kilometersPerHour/1.609d;
        }
        return Math.round(res);
    }
    public static void printConversion(double kilometersPerHour){
        var mph = toMilesPerHour(kilometersPerHour);
        if(mph<0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour +"k/h = " +mph+" mi/h");
        }

    }

    public static void main(String[] args) {
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(1.5d);
        printConversion(75.114);
    }
}
