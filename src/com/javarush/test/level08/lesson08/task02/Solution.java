package com.javarush.test.level08.lesson08.task02;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 22:29
 *
 * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 * Удалить из множества все числа больше 10.
 */

import java.util.HashSet;

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
            set.add(i);

        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThen10(HashSet<Integer> set)
    {
        HashSet<Integer> setRes = new HashSet<Integer>();
        for (Integer el : set){
            if (el <= 10)
                setRes.add(el);
        }

        return setRes;

    }
}


