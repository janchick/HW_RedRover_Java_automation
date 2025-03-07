public class Main {
    public static void main(String[] args) {

        Employee ivan = new Employee();
        ivan.name = "ivan";
        ivan.age = 12;
        ivan.gender = "m";
        ivan.salaryPerDay = 30.0;

        System.out.println(ivan.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(ivan.getSalary(MonthUtils.Q2));

        Manager melory = new Manager();
        melory.name = "melory";
        melory.age = 22;
        melory.gender = "f";
        melory.salaryPerDay = 77.0;
        melory.noOfSubordinates = 0;


        System.out.println(melory.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(melory.getSalary(MonthUtils.Q2));

    }



}
