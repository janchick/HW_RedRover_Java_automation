public class Main {
    public static void main(String[] args) {

        Employee ivan = new Employee("ivan", 13);
      ivan.setAge(13);
      ivan.setGender("m");
        System.out.println(ivan.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(ivan.getSalary(MonthUtils.Q2));

        Manager melory = new Manager("melory",22,"f",77.0,0);

        System.out.println(melory.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(melory.getSalary(MonthUtils.Q2));

        Manager ivanManager = ivan.convertToManager(2);
        System.out.println(ivanManager.getSalary(MonthUtils.FULL_YEAR));

    }

}
