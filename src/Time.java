import java.util.Objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick() {
        if (seconds == 59) {
            if (minutes == 59) {
                minutes = 0;
                seconds = 0;
                if (hours == 23) {
                    hours = 0;
                }
            } else {
            hours++;
            seconds = 0;
            }
        } else {
            seconds++;
        }
    }

    public String info() {
        String info = "";
        if (String.valueOf(hours).length() == 1) {
            info += "0" + hours + ":";
        } else {
            info += hours + ":";
        }
        if (String.valueOf(minutes).length() == 1) {
            info += "0" + minutes + ":";
        } else {
            info += minutes + ":";
        }
        if (String.valueOf(seconds).length() == 1) {
            info += "0" + seconds;
        } else {
            info += seconds;
        }
        return info;
    }
}
