public class FirstMethodChallange
{
    public static void main(String[] args) {
        displayHighScorePosition("Pratik", 2);

        var rank = calculateHighScorePosition(4);
        System.out.println("Rank: " + rank);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name +" managed to get position " +position+  " on the high score list.");
    }

    public static int calculateHighScorePosition(int score){
        var position = 4;
        if(score >= 1000){
            position = 1;
        }
        else if(score >= 500){
            position = 2;
        }
        else if(score >= 100) {
            position = 3;
        }
        return position;
    }
}
