package ru.gb.jcore.regular;

import java.util.Date;

public class TimeLog {

    static Date date = new Date();

    public static String addTimeLog(String s) {
        return String.format(date + "-> %s%n", s);
    }
}
