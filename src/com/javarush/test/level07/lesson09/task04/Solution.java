package com.javarush.test.level07.lesson09.task04;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.02.13
 * Time: 15:12
 *
 * Создай список из слов «мама», «мыла», «раму».
 * Удали все слова содержащие букву «р» и удвой все слова содержащие букву «л».
 *
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            if (s.contains("р"))
            {
                list.remove(i);
            } else if (s.contains("л"))
            {
                list.add(s);
            }
        }
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}
