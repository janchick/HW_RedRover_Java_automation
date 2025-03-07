//Задача №1
//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней. Создать класс
// MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).

public class MonthUtils {

    public static final Month JANUARY  = new Month("January", 31, 22);
    public static final Month FEBRUARY  = new Month("Februaryy", 28, 20);
    public static final Month MARCH  = new Month("March", 31, 22);
    public static final Month APRIL  = new Month("April", 30, 22);
    public static final Month MAY  = new Month("May", 31, 22);
    public static final Month JUNE  = new Month("June", 30, 22);

    public static final Month JULY  = new Month("July", 31, 22);
    public static final Month AUGUST  = new Month("August", 31, 23);
    public static final Month SEPTEMBER  = new Month("September", 30, 22);
    public static final Month OCTOBER  = new Month("October", 31, 23);
    public static final Month NOVEMBER  = new Month("November", 30, 22);
    public static final Month DECEMBER  = new Month("December", 31, 22);

    public static final Month[]  FULL_YEAR = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
            SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    public static final Month[] H1 = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE};//1-е полугодие
    public static final Month[] Q2 = {APRIL, MAY, JUNE}; //2-й квартал

        }

