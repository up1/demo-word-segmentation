package org.example;

import rocks.veer66.Wordcut;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        URL url = Main.class.getResource("/dictionary.txt");
        Wordcut wc = null;
        try {
            wc = Wordcut.fromDixUrl(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(wc.putDelimiter("ตเยน", "|"));
        System.out.println(wc.putDelimiter("แอร์ไดกิ้นขาวLEDแอลอีดี55ux8005", "|"));
    }
}