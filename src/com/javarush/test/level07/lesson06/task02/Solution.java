package com.javarush.test.level07.lesson06.task02;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.02.13
 * Time: 11:08
 *
 * Создай список строк.
 * Добавь в него 5 строчек: «101», «102», «103», «104», «105».
 * Удали первую, среднюю и последнюю и выведи на экран его содержимое и размер.
 * (После удаления одного элемента индексы остальных меняются.
 * Например, если удалить 0-й элемент, то тот, который был 1-м станет 0-м. И т.д.)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("101");
        list.add("102");
        list.add("103");
        list.add("104");
        list.add("105");

        list.remove(0);
        list.remove(1);
        list.remove(2);

        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
        System.out.println(list.size());


    }
}

