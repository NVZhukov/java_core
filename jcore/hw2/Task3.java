package ru.gb.jcore.hw2;

import java.util.Arrays;

public class Task3 {
    /*
    Написать метод, принимающий на вход массив чисел и параметр n.
    Метод должен осуществить циклический (последний элемент при сдвиге становится первым)
    сдвиг всех элементов массива на n позиций;
     */
    public static void main(String[] args) {
        int[] arr = {0, -2, 3, 1, 0, 0, 1, 3, 9, 11, 16, 23, 55};
        System.out.println(Arrays.toString(shiftArray(arr,3)));
    }

    public static int[] shiftArray(int[] arr, int n) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i + n <= arr.length - 1) {
                temp[i + n] = arr[i];
            } else {
                temp[i + n - arr.length] = arr[i];
            }
        }
        return temp;
    }
}
