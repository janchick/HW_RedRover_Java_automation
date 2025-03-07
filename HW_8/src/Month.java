public class Month {
    public String name;       // Имя месяца
    public int days;      // Общее количество дней в месяце
    public int workingDays;    // Количество рабочих дней в месяце

    public void makeMonth(String month, int totalDays, int workingDays) {
        name = month;
        days = totalDays;
        workingDays = workingDays;
    }
}
