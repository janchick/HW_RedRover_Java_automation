//Вывести следующие строки с соответствующим форматированием (как пирамиды):  https://docs.google.com/document/d/1Xe9pnPGs1AfVJnJqVfYkbJTMAZxfea6dD-pi3LR07U4/edit?tab=t.0

public class Hw_7_2_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
