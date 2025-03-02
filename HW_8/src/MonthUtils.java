public class MonthUtils {
    public static Month[] months = new Month[12];

    public static void makeMonthUtils() {
        months[0].makeMonth("Январь", 31, 23);
        months[1].makeMonth("Февраль", 28, 20);
        months[2].makeMonth("Март", 31, 23);
        months[3].makeMonth("Апрель", 30, 21);
        months[4].makeMonth("Май", 31, 23);
        months[5].makeMonth("Июнь", 30, 21);
        months[6].makeMonth("Июль", 31, 23);
        months[7].makeMonth("Август", 31, 23);
        months[8].makeMonth("Сентябрь", 30, 21);
        months[9].makeMonth("Октябрь", 31, 23);
        months[10].makeMonth("Ноябрь", 30, 21);
        months[11].makeMonth("Декабрь", 31, 23);
    }
}
