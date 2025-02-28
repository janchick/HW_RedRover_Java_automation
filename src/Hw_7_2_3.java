//Необходимо написать 4 метода:
//сложение 2х чисел
//вычитание 2х чисел
//умножение 2х чисел
//деление 2х чисел

public class Hw_7_2_3 {
    public static int getSum (int a, int b) {
        return a + b;
    }
    public static int getMin (int a, int b) {
        return a - b;
    }
    public static int getMult (int a, int b) {
        return a * b;
    }
    public static int getDiv (int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(getSum(3,4));
        System.out.println(getMin(11,4));
        System.out.println(getMult(12, 5));
        System.out.println(getDiv(77,7));
    }
}
