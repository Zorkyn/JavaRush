package com.javarush.test.level08.lesson03.task05;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 21:19
 *
 * Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
 * Вывести на экран список значений.
 */
import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        for (Map.Entry<String, String> el : map.entrySet())
            System.out.println(el.getValue());

    }
}


