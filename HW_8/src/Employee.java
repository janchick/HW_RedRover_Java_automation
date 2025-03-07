//Задача №2
//
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день. Класс должен иметь метод -
// getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

//Задача №2
////Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//Имя и ЗП должны быть обязательными, остальные поля — нет.
//Создать необходимые конструкторы и / или setter-ы (по собственному разумению),
// чтобы было удобно создавать эти объекты.
//Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
// за те месяцы которые были переданы в качестве аргумента.

public class Employee {
    public String name;          // Имя сотрудника
    public int age;              // Возраст
    public String gender;        // Пол
    public double salaryPerDay;  // Зарплата в день

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Метод для вычисления зарплаты за переданные месяцы
    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;

        for (Month month : monthArray) {
            totalSalary += getMonthlySalary(month);
        }

        return totalSalary;
    }

    public double getMonthlySalary(Month month) {
        return month.workingDays*salaryPerDay;  // зарплата за 1 месяц, Учитываем только рабочие дни
    }
}
