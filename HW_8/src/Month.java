public class Month {
    public String monthName;       // Имя месяца
    public int noOfTotalDays;      // Общее количество дней в месяце
    public int noOfWorkingDays;    // Количество рабочих дней в месяце

    public void makeMonth(String month, int totalDays, int workingDays) {
        monthName = month;
        noOfTotalDays = totalDays;
        noOfWorkingDays = workingDays;
    }
}
