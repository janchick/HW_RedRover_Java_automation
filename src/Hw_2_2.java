/*Задача №2

Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения, а потом поменять
значения местами (значение переменной a должно оказаться в переменной b и наоборот).
 */
public class Hw_2_2 {
    public static void main(String[] args) {
        int a = 17;
        int b = 22;

        int c = a;
        a = b;
        b = c;

        System.out.println("значение a:" + a);
        System.out.println("значение b:" + b);
    }
}
