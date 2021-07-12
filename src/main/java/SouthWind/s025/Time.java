package SouthWind.s025;

public class Time <H,M,S>{
    private H hour;
    private M min;
    private S sec;

    public H getHour() {
        return hour;
    }

    public void setHour(H hour) {
        this.hour = hour;
    }

    public M getMin() {
        return min;
    }

    public void setMin(M min) {
        this.min = min;
    }

    public S getSec() {
        return sec;
    }

    public void setSec(S sec) {
        this.sec = sec;
    }
}
