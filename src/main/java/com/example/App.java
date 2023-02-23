package com.example;

import java.io.IOException;
import java.util.Properties;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            Properties props = new Properties();
            props.load(App.class.getResourceAsStream("/version.txt"));
            String version = props.getProperty("version", "unknown");
            System.out.println(version);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
