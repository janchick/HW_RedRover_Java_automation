public class Manager {
    public String name;          // Имя сотрудника
    public int age;              // Возраст
    public String gender;        // Пол
    public double salaryPerDay;  // Зарплата в день
    public int noOfSubordinates;        // Количество подчиненных

    // Метод для расчета зарплаты с учетом подчиненных
    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;

        // Рассчитываем базовую зарплату за указанные месяцы
        for (Month month : monthArray) {
            totalSalary += month.workingDays * salaryPerDay; // Учитываем только рабочие дни
        }

        // Добавляем бонус за подчиненных (1% за каждого)
        double bonus = totalSalary * ((double)noOfSubordinates * 0.01);
        return totalSalary + bonus; // Возвращаем общую зарплату с бонусом
    }
}
