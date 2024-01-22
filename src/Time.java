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

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
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

    public void add(String time) {
        hours += Integer.parseInt(time.substring(0, 2));
        minutes += Integer.parseInt(time.substring(3, 5));
        seconds += Integer.parseInt(time.substring(6, 8));
        format();
    }

    public void add(Time time) {
        hours += time.getHours();
        minutes += time.getMinutes();
        seconds += time.getSeconds();
        format();
    }

    public void tick() {
        seconds++;
        format();
    }

    public void format() {
        while (seconds > 59) {
            minutes++;
            seconds -= 60;
        }
        while (minutes > 59) {
            hours++;
            minutes -= 60;
        }
        while (hours > 23) {
            hours -= 24;
        }
    }
}