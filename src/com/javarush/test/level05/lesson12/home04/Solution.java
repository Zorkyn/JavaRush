package com.javarush.test.level05.lesson12.home04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args) throws ParseException
    {
        //Напишите тут ваш код

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(dateFormat.format(new Date()));


    }
}


