// Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//Реализовать 2 варианта:
//использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//без использования конструкции if (шаг цикла на ваше усмотрение).


public class Hw_4_3 {
    public static void main(String[] args) {

        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) { // Проверяем кратность 4
                System.out.println(i); // Выводим число, если оно кратно 4
            }
        }

        for (int i = 40; i <= 60; i += 4) { // Шаг 4, начиная с 40
            System.out.println(i); // Выводим число
        }
    }
}


