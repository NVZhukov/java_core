package ru.gb.jcore.regular;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void fileWrite(String s) {
        try(FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(s);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
