public class Time {
    private int hour,minute,second;
    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour) {
        this.hour=hour;
    }
    public void setMinute(int minute) {
        this.minute=minute;
    }
    public void setSecond(int second) {
        this.second=second;
    }
    public void setTime(int hour,int minute,int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        return this.hour + ":" + this.minute + ":" + this.second;
    }
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour = (hour + 1) % 24;
            }
        }
        return this;
    }

    public Time previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour = (hour == 0) ? 23 : hour - 1;
            }
        }

        return this;
    }
}
