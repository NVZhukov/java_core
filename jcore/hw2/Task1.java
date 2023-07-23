package ru.gb.jcore.hw2;

import java.util.Arrays;

public class Task1 {

    /*
    Доделать сортировку подсчетом с урока (если нет, реализовать) классическим способом через промежуточный массив
     */

    public static void main(String[] args) {
        int[] arr = {0, -2, 3, 1, 0, 0, 1};
        System.out.println(Arrays.toString(countingSort(arr)));
    }

    public static int[] countingSort(int[] array) {
        int[] sortedArr = new int[array.length];

        int min = 0;
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] temp = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            temp[array[i] - min]++;
        }
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = temp[i]; j > 0; j--) {
                sortedArr[index] = i + min;
                index++;
            }
        }
        return sortedArr;
    }
}
