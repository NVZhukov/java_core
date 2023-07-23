package ru.gb.jcore.hw2;

public class Task2 {

    /*
    Написать метод «Шифр Цезаря», с булевым параметром зашифрования и расшифрования и числовым ключом;
     */

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(caesar(s, 2, false));
    }

    private static String caesar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty())
            return null;
        final int len = in.length();
        char[] out = new char[len];
        for (int i = 0; i < len; ++i) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
        }
        return new String(out);
    }
}
