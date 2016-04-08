package org.sourceit;

import java.util.Random;

import static java.lang.Integer.*;

public class HomeTask2 {
    static final int START = 2;
    static final int END = 15;

    public static void main(String[] args) {
        binar(125);
        oktal(50);
        hex(1010);
        BinToDec(1111101);
        OktToDec(62);
        HexToDec(valueOf(0x3f2));
        generateTwoDimensionArray(5, 5);
        sum(10);
        product(7, 10);

        System.out.println("Простые числа: ");
        for (int i = START; i < END; i++) {
            if (getSimple(i)) {
                System.out.println(i);
            }
        }
    }


    /**
     *     * Конвертирует десятичное число в бинарную форму
     *     
     */
    public static long binar(int a) {
        System.out.print("Бинарная форма числа: "  + toBinaryString(a));
        return Long.parseLong(toBinaryString(a));
    }

    /**
     *     * Конвертирует десятичное число в октальную форму
     *     
     */
    public static long oktal(int a) {
        System.out.println("\n" + "Октальная форма числа: " + toOctalString(a));
        return Long.parseLong(toOctalString(a));
    }

    /**
     *     * Конвертирует десятичное число в хексовою форму
     *     
     */

    public static long hex(int h) {

        System.out.println("Хексовая форма числа: " + toHexString(h));
        return Long.parseLong(toHexString(h));
    }

    /**
     *     * Конвертирует бинарную форму в десятичное число
     *     
     */
    public static long BinToDec(long d) {
        System.out.println("Из бинарной формы в десятичную: " + Long.parseLong(String.valueOf(d), 2));
        return Long.parseLong(String.valueOf(d), 2);
    }

    /**
     *     * Конвертирует октальную форму в десятичное число
     *     
     */
    public static long OktToDec(long f) {
        System.out.println("Из октальной формы в десятичную: " + Long.parseLong(String.valueOf(f), 8));
        return Long.parseLong(String.valueOf(f), 8);
    }

    /**
     *     * Конвертирует хексовую форму в десятичное число
     *     
     */
    public static int HexToDec(int s) {
        String p;
        Integer g;
        p = toBinaryString(s);
        g = parseInt(p, 2);
        System.out.println("Из хексовой формы в десятичную: " + g);
        return g;
    }



    // /**
// * Генерируют двумерный массив, со случайными числами.
// *
// * @param rows
// * @param columns
// * @return двумерный массив
// */
    public static int[][] generateTwoDimensionArray(int rows, int columns) {
        int[][] generateTwoDimensionArray = new int[5][5];
        Random r = new Random();

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                generateTwoDimensionArray[i][j] = r.nextInt(100);
        System.out.println("Двумерный массив: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(generateTwoDimensionArray[i][j] + " ");
            System.out.println();
        }
        return generateTwoDimensionArray;
    }

//
// /**
// * Определить и вывести на экран индекс строки с
// * наибольшим по модулю произведением элементов.
// * Если таких строк несколько, то вывести индекс
// * первой встретившейся из них.
// *
// * @param input двумерный массив
// * @return 1 индекс строки
// */

    public static int findMaxProduct(int[][] input) {
        int m[][] = new int[4][4];
        int Max1 = 1;
        int ij = 0;
        for (int i = 0; i < m.length; i++) {
            int Max = 1;
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 12 - 6);
                Max = Max * (Math.abs(m[i][j]));

            }
            if (Max1 < Max) {
                Max1 = Max;
                ij = i + 1;
            }
        }
        System.out.println("Двумерный массив: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();

        }

        if (ij == 0)
            System.out.println("Произведение во всех строках равно 0 ");
        else
            System.out.println("Индекс строки с наибольшим по модулю произведением элементов: ");
        System.out.println(ij);
        return ij;
    }

    // /**
// * Выводит все простые числа из интервала от 2 до n.
// *
// * @param n
// * @return массив простых чисел.
// */
    public static boolean getSimple(int value) {
        if ((value == 2) ||
                (value == 3) ||
                (value == 5) ||
                (value == 7)) {
            return true;
        }
        return !((value % 2 == 0) ||
                (value % 3 == 0) ||
                (value % 5 == 0) ||
                (value % 7 == 0));
    }

//
// // Рекурсивные методы. Реализовать их нужно с помощью рекурсии.
//
// /**
// * Вычисляет сумму чисел от 1 до n включительно.
// *
// * @param n предел
// * @return сумма
// */

    public static long sum(int n) {
        int result = 0;
        System.out.print("Сумма чисел в интервале от 1 до " + n + " равна: " + "\n");
        for (int i = 1; i <= n; i++) {
            result += i;
            System.out.println(result);
        }
        return result;
    }

// /**
// * Метод вычисляет, результат умножения.
// *
// * @param first
// * @param second
// * @return
// */

    public static int product(int first, int second) {
        System.out.print("Результат умножения чисел в интервале от " + first + " до " + second + " равен: " + "\n");
        int res;
            res = first * second;
            System.out.println(res);
        return res;
        }
}
