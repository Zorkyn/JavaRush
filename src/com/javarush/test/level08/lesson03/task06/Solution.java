package com.javarush.test.level08.lesson03.task06;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 21:21
 *
 * Есть коллекция HashMap<Object, Object>, туда занесли 10 различных пар объектов.
 * Вывести содержимое коллекции на экран.
 * Пример вывода (тут показана только одна строка):
 *      Sim – 5
 */

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);

        for (Map.Entry<String, Object> el : map.entrySet())
            System.out.println(el.getKey() + " - " + el.getValue());

    }
}


