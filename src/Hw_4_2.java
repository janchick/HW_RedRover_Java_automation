//Необходимо вывести все положительные степени числа 5 до тех пор, пока результат возведения
// в степень меньше 100000, вывести результат возведения в степень.

import static java.lang.Math.pow;

public class Hw_4_2 {
    public static void main(String[] args) {
        int value = 1;
        int result = 5;
       // Math.pow (5, i);

        while (result < 100000) {
            System.out.println(result);
            value ++;
            result = (int) Math.pow (5, value);
                  }

    }
}
