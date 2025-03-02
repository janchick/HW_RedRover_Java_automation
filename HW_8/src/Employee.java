public class Employee {
    public String name;          // Имя сотрудника
    public int age;              // Возраст
    public String gender;        // Пол
    public double salaryPerDay;  // Зарплата в день

    // Метод для вычисления зарплаты за переданные месяцы
    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;

        for (Month month : monthArray) {
            totalSalary += month.noOfWorkingDays * salaryPerDay; // Учитываем только рабочие дни
        }

        return totalSalary;
    }
}
