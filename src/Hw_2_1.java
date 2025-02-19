
    /*Задача №1
Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным
на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение,
вычитание, деление и остаток от деления. Также сделать проверку на четность этих переменных и
вывести результат.
 */
    public class Hw_2_1 {
        public static void main(String[] args) {
            int a = 15;
            int b = 22;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);


            if (a % 2 == 0) {
                System.out.println(a + " является четным числом.");
            } else {
                System.out.println(a + " является нечетным числом.");
            }

            // Проверка четности переменной b
            if (b % 2 == 0) {
                System.out.println(b + " является четным числом.");
            } else {
                System.out.println(b + " является нечетным числом.");
            }

        }
    }