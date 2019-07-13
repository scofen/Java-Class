public class PlayingCat {

    public static void main(String[] args) {

        boolean playing = isCatPlaying(true, 10);
        System.out.println(playing);
        playing = isCatPlaying(false, 36);
        System.out.println(playing);
        playing = isCatPlaying(true, 35);
        System.out.println(playing);
        playing = isCatPlaying(false, 25);
        System.out.println(playing);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer == true && temperature >=25 && temperature <=45) {
            return true;

        } else if (summer == false && temperature >=25 && temperature <=35) {
            return true;
        } else {
            return false;
        }

    }
}





