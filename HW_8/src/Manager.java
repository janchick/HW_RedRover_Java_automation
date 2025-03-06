public class Manager {
    public String name;          // Имя сотрудника
    public int age;              // Возраст
    public String gender;        // Пол
    public double salaryPerDay;  // Зарплата в день
    public int noOfSubordinates;

    // Метод для вычисления зарплаты за переданные месяцы
    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;

        for (Month month : monthArray) {
            totalSalary += getMonthlySalary(month);
        }

        return totalSalary;
    }

    public double getMonthlySalary(Month month) {
        double bonusKoef = 1 + noOfSubordinates * 0.01;
        return month.workingDays * salaryPerDay;  // зарплата за 1 месяц, Учитываем только рабочие дни
    }
}
