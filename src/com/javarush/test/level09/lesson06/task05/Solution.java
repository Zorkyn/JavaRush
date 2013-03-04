package com.javarush.test.level09.lesson06.task05;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 04.03.13
 * Time: 21:53
 *
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 *      HashMap<String, String> map = new HashMap<String, String>(null);
 *      map.put(null, null);
 *      map.remove(null);
 */
import java.util.HashMap;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
