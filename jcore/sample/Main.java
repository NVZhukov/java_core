package ru.gb.jcore.sample;

import ru.gb.jcore.regular.FileWrite;
import ru.gb.jcore.regular.TimeLog;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Напишите заметку: ");
        String note = sc.nextLine();
        String result = TimeLog.addTimeLog(note);
        FileWrite.fileWrite(result);
    }
}
