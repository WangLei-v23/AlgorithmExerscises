package SouthWind.s025;

public enum WeekEnumTest {
    MONDAY(1,"周一"),
    TUESDAY(2,"周二"),
    WEDENSDAY(3,"周三"),
    THURSDAY(4,"周四"),
    FRIDAY(5,"周五"),
    SATURDAY(6,"周六"),
    SUNDAY(7,"周日");
    private int code;
    private String day;

    WeekEnumTest(int code, String day) {
        this.code = code;
        this.day = day;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
