package com.dsa.trail;

import com.sun.org.slf4j.internal.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;


public class DateFormatTest {
    public static void main(String [] arr) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        try {
            Date date = df.parse("2022-03-23T01:20:56.111Z");
            System.out.println("date= " + date);
            String dateStr = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(date);
            System.out.println("dateStr= "+ dateStr);
        } catch (Exception ex)	{
            System.out.println("Invalid JsonPath {} for Json when parsing for date: ");
        }
    }
}
