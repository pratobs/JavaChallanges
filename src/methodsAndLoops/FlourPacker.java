package methodsAndLoops;

public class FlourPacker {
    public static boolean canPack (int bigCount,int smallCount, int goal){
        if(bigCount  <  0|| smallCount < 0 || goal < 0 ){
            return false;
        }

        if(goal < 5){
            return goal <= smallCount;
        }else {
            for(int i = 0; i <= bigCount ; i++){
                for(int j = 0; j <= smallCount ; j++){
                    if(i*5 + j == goal){
                        System.out.println( i + " : " + j);
                        return i*5 + j == goal;
                    }
                }
            }
            return false;
        }
    }
    public static boolean canPack2 (int bigCount,int smallCount, int goal){
        if(bigCount  <  0|| smallCount < 0 || goal < 0 ){
            return false;
        }

        if(goal < 5){
            return goal <= smallCount;
        }else {
            var remaining  = goal - bigCount * 5;
            System.out.println(smallCount + " " + remaining);
            return smallCount >= remaining;
        }

    }

    public static void main(String[] args) {
//        System.out.println(canPack(1,0,4));
//        System.out.println(canPack(1,0,5));
//        System.out.println(canPack(0,5,4));
//        System.out.println(canPack(2,2,11));
//        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,5));

    }
}
