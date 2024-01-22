import java.util.Objects;

public class Time {
    private String hours;
    private String minutes;
    private String seconds;

    public Time(String hours, String minutes, String seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick() {
        if (seconds.equals(String.valueOf(59))) {
            if (minutes.equals(String.valueOf(59))) {
                minutes = "00";
                seconds = "00";
                if (hours.equals(String.valueOf(23))) {
                    hours = "00";
                }
            } else {
            hours = String.valueOf(Integer.parseInt(hours) + 1);
            seconds = "00";
            }
        } else {
            seconds = String.valueOf(Integer.parseInt(seconds) + 1);
        }
    }

    public String info() {
        if (hours.length() == 1) {
            hours = "0" + hours;
        }
        if (minutes.length() == 1) {
            minutes = "0" + minutes;
        }
        if (seconds.length() == 1) {
            seconds = "0" + seconds;
        }
        return hours + ":" + minutes + ":" + seconds;
    }
}
