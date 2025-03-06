//Задача №1
//
//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней. Создать класс
// MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).

public class MonthUtils {

    public static final Month JANUARY  = makeMonth("January", 31, 22);
    public static final Month FEBRUARY  = makeMonth("Februaryy", 28, 20);
    public static final Month MARCH  = makeMonth("March", 31, 22);
    public static final Month APRIL  = makeMonth("April", 30, 22);
    public static final Month MAY  = makeMonth("May", 31, 22);
    public static final Month JUNE  = makeMonth("June", 30, 22);

    public static final Month JULY  = makeMonth("July", 31, 22);
    public static final Month AUGUST  = makeMonth("August", 31, 23);
    public static final Month SEPTEMBER  = makeMonth("September", 30, 22);
    public static final Month OCTOBER  = makeMonth("October", 31, 23);
    public static final Month NOVEMBER  = makeMonth("November", 30, 22);
    public static final Month DECEMBER  = makeMonth("December", 31, 22);

    public static final Month[]  FULL_YEAR = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
            SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public static final Month[] H1 = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};//1-е полугодие
    public static final Month[] Q2 = {APRIL, MAY, JUNE}; //2-й квартал

        private static Month makeMonth(String name, int days, int workingDays) {
        Month month = new Month();
        month.name = name;
        month.days = days;
        month.workingDays = workingDays;
        return month;

    }
}
