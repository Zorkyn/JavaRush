package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Ivanov1", "Ivan1");
        map.put("Ivanov2", "Ivan2");
        map.put("Ivanov4", "Ivan3");
        map.put("Ivanov4", "Ivan4");
        map.put("Ivanov5", "Ivan5");
        map.put("Ivanov6", "Ivan6");
        map.put("Ivanov7", "Ivan6");
        map.put("Ivanov8", "Ivan8");
        map.put("Ivanov9", "Ivan9");
        map.put("Ivanov10", "Ivan10");

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
