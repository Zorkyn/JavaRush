package com.javarush.test.level09.lesson11.home04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat sd = new SimpleDateFormat("MMM", Locale.UK);
        String month = sd.format(new Date());
        sd = new SimpleDateFormat("dd, yyyy", Locale.UK);
        String day_year = sd.format(new Date());

        System.out.println(month.toUpperCase() + " " + day_year);
    }
}
