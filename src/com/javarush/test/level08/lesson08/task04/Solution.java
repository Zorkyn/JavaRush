package com.javarush.test.level08.lesson08.task04;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 23:01
 *
 * Создать словарь (Map<String, Date>),
 * и занести в него десять записей по принципу: «фамилия» - «дата рождения».
 * Удалить из словаря всех людей родившихся летом.
 */

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Сталлоне1", new Date("August 2 1980"));
        map.put("Сталлоне2", new Date("August 1 1980"));
        map.put("Сталлоне3", new Date("January  1 1980"));
        map.put("Сталлоне4", new Date("January  7 1980"));
        map.put("Сталлоне5", new Date("January  5 1980"));
        map.put("Сталлоне6", new Date("July 1 1980"));
        map.put("Сталлоне7", new Date("JUNE 1 1980"));
        map.put("Сталлоне8", new Date("July 20 1980"));
        map.put("Сталлоне9", new Date("January 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> el = iterator.next();
            int month = el.getValue().getMonth();
            if ( (5 == month) || (6 == month) || (7 == month) )
                iterator.remove();
        }

    }
}

