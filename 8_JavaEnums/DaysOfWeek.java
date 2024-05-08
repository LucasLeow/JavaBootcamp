enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    DaysOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        // Write your code here to return the name of the day
        return this.name;
    }

    public boolean isWeekday() {
        // Write your code here to check if this day is a weekday
        if (this == SATURDAY || this == SUNDAY) return false;
        return true;
    }

    public boolean isHoliday() {
        // Write your code here to check if this day is a holiday
        return !this.isWeekday();
    }
}