package com.javarush.test.level08.lesson08.task05;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 23:19
 *
 * Создать словарь (Map<String, String>)
 * занести в него десять записей по принципу «фамилия»- «имя».
 * Удалить людей, имеющих одинаковые имена.
 */

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++)
            map.put("fio" + i, "name" + i);
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            copy2.remove(key);
            if (copy2.containsValue(value))
            {
                //map.remove(key);
                removeItemFromMapByValue(map, value);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}


