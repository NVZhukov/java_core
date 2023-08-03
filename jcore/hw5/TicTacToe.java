package ru.gb.jcore.hw5;

import java.io.*;
import java.util.Arrays;

public class TicTacToe {
    /*
    Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
    и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
    где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом,
    3 – резервное значение. Такое предположение позволит хранить в одном
    числе типа int всё поле 3х3. Реализовать функционал с записью в файл и обратно игрового поля.
    Выводить в консоль игровое поле после импорта, заменяя числа символами X, O, •(пусто)
     */

    public static void writeGameField(int[] array) throws IOException {
        try (FileWriter fw = new FileWriter("XO.txt", true)) {
            fw.write(String.format(Arrays.toString(array) + "%n"));
        }
    }

    public static String readGameField(String path) throws IOException {
        StringBuilder gameField = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = reader.readLine()) != null) {
                gameField.append(s);
                gameField.append('\n');
            }
        }
        return gameField.toString();
    }

    public static void printGameField(String field) {
        String str = field.replaceAll("[^0-9]", "");
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case '1': c[i] = 'X';
                    break;
                case '2': c[i] = 'O';
                    break;
                case '0': c[i] = '•';
                    break;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (i % 3 == 0) System.out.println();
            if (i % 9 == 0) System.out.println("-----");
                System.out.print(c[i] + " ");
        }
    }
}
