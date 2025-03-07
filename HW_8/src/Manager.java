public class Manager {
    private final String name;          // Имя сотрудника
    private int age;              // Возраст
    private String gender;        // Пол
    private final double salaryPerDay;  // Зарплата в день
    private int noOfSubordinates;        // Количество подчиненных

    public Manager(String name, int age, String gender, double salaryPerDay, int noOfSubordinates) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryPerDay = salaryPerDay;
        this.noOfSubordinates = noOfSubordinates;
    }

    public Manager(String name, double salaryPerDay) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public int getNoOfSubordinates() {
        return noOfSubordinates;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNoOfSubordinates(int noOfSubordinates) {
        this.noOfSubordinates = noOfSubordinates;
    }

    // Метод для расчета зарплаты с учетом подчиненных
    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;

        // Рассчитываем базовую зарплату за указанные месяцы
        for (Month month : monthArray) {
            totalSalary += month.getWorkingDays() * salaryPerDay; // Учитываем только рабочие дни
        }

        // Добавляем бонус за подчиненных (1% за каждого)
        double bonus = totalSalary * ((double)noOfSubordinates * 0.01);
        return totalSalary + bonus; // Возвращаем общую зарплату с бонусом
    }
}
