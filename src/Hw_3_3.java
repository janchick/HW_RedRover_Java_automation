public class Hw_3_3 {
    public static void main(String[] args) {
int a = 111;

if (a > 10){
    System.out.println("больше 10");
}

        if (a < 100){
            System.out.println("меньше 100");
        }

        //результат деления на 2 больше 20 - если это соответствует истине
        if ((a/2)  > 20){
            System.out.println("результат деления на 2 больше 20");
        }

        //значение переменной между 5 и 40 включительно - если это правда
        if ((a >= 5)  && (a <= 40)) {
            System.out.println("значение переменной между 5 и 40");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

    }
}
