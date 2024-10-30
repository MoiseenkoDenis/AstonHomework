package ru.aston.homework.lesson_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(5, 10));
        System.out.println(isPositive(0));
        System.out.println(isNegative(-5));
        printStringMultipleTimes("Hello", 3);
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2021));
        int[] binaryArray = new int[]{1, 0, 1, 1, 0, 0, 1};
        flipBinaryArray(binaryArray);
        System.out.println(Arrays.toString(binaryArray));
        int[] sequenceArray = createArrayWithSequence(100);
        System.out.println(Arrays.toString(sequenceArray));
        int[] numbersArray = new int[]{1, 5, 3, 2, 11, 4, 5, 6, 8, 9, 10};
        multiplyLessThan6By2(numbersArray);
        System.out.println(Arrays.toString(numbersArray));
        int[][] squareMatrix = new int[5][5];
        fillDiagonal(squareMatrix);
        int[][] var5 = squareMatrix;
        int var6 = squareMatrix.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            int[] row = var5[var7];
            System.out.println(Arrays.toString(row));
        }

        int[] initializedArray = createArrayWithInitialValue(5, 7);
        System.out.println(Arrays.toString(initializedArray));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; ++i) {
            System.out.println(str);
        }

    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void flipBinaryArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = array[i] == 0 ? 1 : 0;
        }

    }

    public static int[] createArrayWithSequence(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length; ++i) {
            array[i] = i + 1;
        }

        return array;
    }

    public static void multiplyLessThan6By2(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

    }

    public static void fillDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }

    }

    public static int[] createArrayWithInitialValue(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; ++i) {
            array[i] = initialValue;
        }

        return array;
    }
}
