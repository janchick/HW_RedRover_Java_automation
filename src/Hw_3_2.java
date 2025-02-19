public class Hw_3_2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        double sum = (a + b)%2;
        if (sum == 0) {
            System.out.println("maybe a and b are even");   //если сумма переменных четная
        } else {
            System.out.println("some variable is odd"); //если сумма переменных нечетная
        }
    }
}
