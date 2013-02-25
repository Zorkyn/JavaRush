package com.javarush.test.level06.lesson11.home04;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        SimpleDateFormat date = new SimpleDateFormat("dd");
        int dd = Integer.parseInt(date.format(new Date()));
        if (dd % 2 == 0) {
            System.out.println("Мама мыла раму");
        } else {
            System.out.println("Рама мыла маму");
        }


    }
}
