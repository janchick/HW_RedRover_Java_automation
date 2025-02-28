//Необходимо написать 4 метода:
//сложение 2х чисел
//вычитание 2х чисел
//умножение 2х чисел
//деление 2х чисел

import com.sun.jdi.IntegerValue;

public class Hw_7_2_3_codewars_1 {
  /*  public static int getSum (int a, int b) {
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

   //https://www.codewars.com/kata/53ee5429ba190077850011d4/train/java
    //Code as fast as you can! You need to double the integer and return it.
    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i * 2;
    }
//https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
    //Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
//
//Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
    public static boolean isLove(final int flower1, final int flower2) {
        // Check if one flower has an even number of petals and the other has an odd number
        return (flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0);
        //return (flower1 + flower2)%2=1
    }
    //https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
    //We need a function that can transform a number (integer) into a string.
    //
    //What ways of achieving this do you know?
    //Examples (input --> output):
    //
    //123  --> "123"
    //999  --> "999"
    //-100 --> "-100"
    public static String numberToString(int num) {
        return String.valueOf(num); // Return a string of the number here!
    }

    //https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
    //Given an array of integers your solution should find the smallest integer.
    //
    //For example:
    //
    //    Given [34, 15, 88, 2] your solution will return 2
    //    Given [34, -345, -1, 100] your solution will return -345
    //
    //You can assume, for the purpose of this kata, that the supplied array will not be empty.
*/

        public static int findSmallestInt(int[] args) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < args.length; i++){
                if (min > args[i]){
                    min = args[i];
                }
            }

            return min;
        }
    public static void main(String[] args) {
        int[] array = {34, 15, 88, 2};
        System.out.println(findSmallestInt(array));
        System.out.println(countingSheep(3));
    }

    public static String countingSheep(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += i + 1 + " sheep...";
        }
        return result;
    }


}
