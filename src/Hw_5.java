import java.util.Arrays;

public class Hw_5 {

    public static void main(String[] args) {
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("Задача №1");
        //Задача №1
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести все нечетные числа из массива.
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) { // or (array1[i] % 2 = 1)
                System.out.println(array1[i]);
            }
        }
        System.out.println("Задача №2");
        //Задача №2
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести все значения массива больше 5.
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 5) {
                System.out.println(array2[i]);
            }
        }
        System.out.println("Задача №3");
        //Задача №3
        //
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо увеличить все значения массива на 15.
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array3.length; i++) {
            array3[i] += 15;
        }
        System.out.println(Arrays.toString(array3));//System.out.println(array3[i]);

    }
}
