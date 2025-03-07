public class Month {
    private final String name;       // Имя месяца
    private final int days;      // Общее количество дней в месяце
    private final int workingDays;    // Количество рабочих дней в месяце

    public Month(String month, int totalDays, int workingDays) {
        this.name = month;
        this.days = totalDays;
        this.workingDays = workingDays;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getWorkingDays() {
        return workingDays;
    }
}
