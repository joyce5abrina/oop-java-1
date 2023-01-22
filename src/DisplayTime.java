public class DisplayTime {
    // static final int SECONDS_IN_HOUR ITS A CONSTANT
    static final int SECONDS_IN_HOUR = 1600;
    static final int SENCONDS_IN_MIN = 60;
    public static  void  main(String[] args) {
        int totalSeconds = 10289;
        int hours = totalSeconds / SECONDS_IN_HOUR;
        int minutes = totalSeconds % SENCONDS_IN_MIN;
        int seconds = totalSeconds % SECONDS_IN_HOUR % SENCONDS_IN_MIN;
        System.out.println("There are:" + hours + " hours " + minutes
            + " minutes and " + seconds + " seconds in " + totalSeconds);
        // How many hours, minutes and seconds to know this)

    }
}
