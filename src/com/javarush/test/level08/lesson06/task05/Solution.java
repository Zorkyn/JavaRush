package com.javarush.test.level08.lesson06.task05;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 22:14
 *
 * Написать функцию, которая возвращает список,
 * который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution
{
    public static List  getListForGet()
    {
        ArrayList<Object> list = new ArrayList<Object>();
        return list;
    }

    public static List  getListForSet()
    {
        ArrayList<Object> list = new ArrayList<Object>();
        return list;
    }

    public static List  getListForAddOrInsert()
    {
        LinkedList<Object> list = new LinkedList<Object>();
        return list;
    }

    public static List  getListForRemove()
    {
        LinkedList<Object> list = new LinkedList<Object>();
        return list;
    }
}


