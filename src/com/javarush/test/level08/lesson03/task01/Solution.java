package com.javarush.test.level08.lesson03.task01;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 20:56
 *
 * Создать коллекцию HashSet с типом элементов String.
 * Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
 * Вывести содержимое коллекции на экран.
 * Посмотреть, как изменился порядок добавленных элементов.
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String el : set)
            System.out.println(el);

    }
}
