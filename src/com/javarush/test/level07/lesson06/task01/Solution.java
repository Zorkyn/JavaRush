package com.javarush.test.level07.lesson06.task01;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.02.13
 * Time: 10:49
 *
 * Создай список строк.
 * Добавь в него 5 различных строчек и выведи его размер и содержимое на экран.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
        {
            //list.add(reader.readLine());
            list.add("name" + i);
        }

        System.out.println(list.size());
        System.out.println(list);
        //for (int i = 0; i < list.size(); i++)
        //  System.out.println(list.get(i));

    }
}


