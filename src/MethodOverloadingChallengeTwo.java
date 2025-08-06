public class MethodOverloadingChallengeTwo {
    public static String getDurationString(int seconds){
        var minutes = seconds/60;
        var actualSeconds = seconds%60;
        return getDurationString(minutes, actualSeconds);
    }
    public static String getDurationString(int minutes ,int seconds){
        if (minutes>=0 && seconds>=0 && seconds<=59){
            var hours = minutes/60;
            var minute = minutes%60;
            return hours+"h "+minute+"m "+seconds%60+"s";
        }
        else {
            return "Invalid Duration";
        }
    }
    public static void main(String[] args) {
        System.out.println(getDurationString(1900000));
    }
}
