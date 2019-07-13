public class getDuration {

    public static final String INVALID_VALUE_MESSAGE = "The value must be greater than 0";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 12));
        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0 || seconds > 60)) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int totalSeconds = ((minutes * 60) + seconds);
            int XXh = totalSeconds / 3600;
            int YYm = ((totalSeconds % 3600) / 60);
            int ZZs = ((totalSeconds % 3600) % 60);
            return "The total is = " + XXh + " hours " + YYm + " minutes and " + ZZs + " seconds";
        }

    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = (seconds % 60);
        return getDurationString(minutes, remainingSeconds);


    }
}