package com.javarush.test.level07.lesson09.task03;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.02.13
 * Time: 14:58
 *
 * Создай список из слов «мама», «мыла», «раму».
 * Вставь в список после каждого слова, строку содержащую слово «именно».
 * Вывести результат на экран.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}
