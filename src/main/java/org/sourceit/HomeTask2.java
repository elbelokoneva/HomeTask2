package org.sourceit;

public class HomeTask2 {

    public static void main(String[] args) {
        binar(125);
        oktal(50);
        hex(3030);
        BinToDec(1111101);
        OktToDec(62);
        HexToDec(Integer.valueOf(0xbd6));
    }

    /**
     * Конвертирует десятичное число в бинарную форму
     */
    public static void binar(int a) {
        int b;
        String temp = " ";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        System.out.print("Бинарная форма числа: " + temp);
    }

    /**
     * Конвертирует десятичное число в октальную форму
     */
    public static void oktal(int a) {
        System.out.println("\n" + "Октальная форма числа: " + Integer.toOctalString(a));
    }

    /**
     * Конвертирует десятичное число в хексовою форму
     */

    public static void hex(int h) {

        System.out.println("Хексовая форма числа: " + Integer.toHexString(h));
    }

    /**
     * Конвертирует бинарную форму в десятичное число
     */
    public static void BinToDec(long d) {
        System.out.println("Из бинарной формы в десятичную: " + Long.parseLong(String.valueOf(d), 2));
    }

    /**
     * Конвертирует октальную форму в десятичное число
     */
    public static void OktToDec(long f) {
        System.out.println("Из октальной формы в десятичную: " + Long.parseLong(String.valueOf(f), 8));
    }

    /**
     * Конвертирует хексовую форму в десятичное число
     */
    public static void HexToDec(Integer s) {
        String p;
        Integer g;
        p = Integer.toBinaryString(s);
        g = Integer.parseInt(String.valueOf(p), 2);
        System.out.println("Из хексовой формы в десятичную: " + g);
    }
}
//    /**
//     * Генерируют двумерный массив, со случайными числами.
//     *
//     * @param rows
//     * @param columns
//     * @return двумерный массив
//     */
//    public static int[][] generateTwoDimensionArray(int rows, int columns) {
//        return null;
//    }
//
//    /**
//     * Определить и вывести на экран индекс строки с
//     * наибольшим по модулю произведением элементов.
//     * Если таких строк несколько, то вывести индекс
//     * первой встретившейся из них.
//     *
//     * @param input двумерный массив
//     * @return индекс строки
//     */
//    public static int findMaxProduct(int[][] input) {
//        return 1;
//    }
//
//    /**
//     * Выводит все простые числа из интервала от 2 до n.
//     *
//     * @param n
//     * @return массив простых чисел.
//     */
//    public static int[] getSimple(int n) {
//        return null;
//    }
//
//    // Рекурсивные методы. Реализовать их нужно с помощью рекурсии.
//
//    /**
//     * Вычисляет сумму чисел от 1 до n включительно.
//     *
//     * @param n предел
//     * @return сумма
//     */
//    public static long sum(int n) {
//        return 0;
//    }
//
//    /**
//     * Метод вычисляет, результат умножения.
//     *
//     * @param first
//     * @param second
//     * @return
//     */
//    public static int product(int first, int second) {
//        return -1;
//    }


