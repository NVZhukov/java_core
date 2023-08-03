package ru.gb.jcore.hw5;

import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {
    private static final String BACKUP_PATH = "./backup";

    public static void main(String[] args) {
        int[] gameField = {0, 1, 2, 3, 0, 1, 1, 2, 0};
        try {
            createBackup(".");
            TicTacToe.writeGameField(gameField);
            TicTacToe.printGameField(TicTacToe.readGameField("XO.txt"));
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }
    }

    /*
    1. Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
     во вновь созданную папку ./backup
     */

    public static void createBackup(String path) throws IOException {
        File folder = new File(path);
        if (isDirectoryEmpty(folder)) {
            throw new RuntimeException("Пустая директория! нечего копировать!");
        } else {
            String[] files = folder.list();
            File dest = new File(BACKUP_PATH);
            if (!dest.exists()) {
                Files.createDirectory(Paths.get(BACKUP_PATH));
                for (String s : files) {
                    File f = new File(path + "/" + s);
                    if (f.isFile()) {
                        Path from = Paths.get(path + "/" + s);
                        Path copyFile = Paths.get(BACKUP_PATH + "/" + s);
                        Files.copy(from, copyFile, REPLACE_EXISTING);
                    }
                }
            }
        }
    }

    private static boolean isDirectoryEmpty(File directory) {
        String[] files = directory.list();
        return files.length == 0;
    }
}
