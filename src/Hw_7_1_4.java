//Дан массив:
//int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//необходимо вывести среднее арифметическое всех значений массива.

public class Hw_7_1_4 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            sum += elem;
        }
        System.out.println(sum/ array.length);
    }
}
