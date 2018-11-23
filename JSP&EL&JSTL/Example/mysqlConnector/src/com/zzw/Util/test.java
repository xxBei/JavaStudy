package com.zzw.Util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class test {
    public static void main(String[] args) {
        try {
            Properties ppt = new Properties();
            InputStream is = test.class.getClassLoader().getResourceAsStream("jdbc.properties");
            ppt.load(is);
            String driver = ppt.getProperty("driver");
            String url = ppt.getProperty("url");
            String user = ppt.getProperty("user");
            String password = ppt.getProperty("password");

            System.out.println(driver);
            System.out.println(url);
            System.out.println(user);
            System.out.println(password);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
