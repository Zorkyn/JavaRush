package com.javarush.test.level08.lesson08.task03;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 22:36
 *
 * Создать словарь (Map<String, String>)
 * занести в него десять записей по принципу «Фамилия»- «Имя».
 * Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++)
            map.put("fio"+i, "name"+i);
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> el : map.entrySet()){
            if (name.equals(el.getValue()))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String, String> el : map.entrySet()){
            if (familiya.equals(el.getKey()))
                count++;
        }
        return count;

    }
}


