//Задача №2
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день. Класс должен иметь метод -
// getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//Задача №2
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//Имя и ЗП должны быть обязательными, остальные поля — нет.
//Создать необходимые конструкторы и / или setter-ы (по собственному разумению),
// чтобы было удобно создавать эти объекты.
//Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
// за те месяцы которые были переданы в качестве аргумента.
//Задача №3
//Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
// Поля должны быть спрятаны, для каждого поля создать getter.
//Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые б
// ыли переданы в качестве аргумента.
//К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
//В классе Employee создать метод convertToManager(int numberOfSubordinates). Этот метод создаст и вернет
// объект типа Manager с теми же личными данными, что были у Employee, и запишет переданное в него количество подчиненных.

public class Employee {
    private final String name;          // Имя сотрудника
    private int age;              // Возраст
    private String gender;        // Пол
    private final double dailySalary;  // Зарплата в день


    public Employee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }

    public Employee(String name, int age, String gender, double dailySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
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

    public double getDailySalary() {
        return dailySalary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Метод для вычисления зарплаты за переданные месяцы
    public double getSalary(Month[] monthArray) {
        double salary = 0;

        for (Month month : monthArray) {
            salary += getMonthlySalary(month);
        }

        return salary;
    }

    public double getMonthlySalary(Month month) {
        return month.getWorkingDays()*dailySalary;  // зарплата за 1 месяц, Учитываем только рабочие дни
    }

    public Manager convertToManager(int numberOfSubordinates) {
       return new Manager(name, age, gender, dailySalary, numberOfSubordinates);
    }
}
