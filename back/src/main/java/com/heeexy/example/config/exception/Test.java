package com.heeexy.example.config.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {
    public static void main(String[] args) throws ParseException {
        String date = "Mon Feb 08 2021 18:04:03 GMT+0800 (中国标准时间)";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss 'GMT'Z", Locale.ENGLISH);
        Date d = sdf.parse(date);
        String formatDate = new SimpleDateFormat("HH:mm:ss").format(d);
        System.out.println(formatDate);

    }
}
