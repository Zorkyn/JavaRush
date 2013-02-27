package com.javarush.test.level08.lesson06.task02;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 21:46
 * Для каждого из них провести 10 тысяч вставок, удалений, а также вызовов get и set.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution
{
    public static final int COUNT = 5;

    public static void main(String[] args) throws Exception
    {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list)
    {
        for (int i = 0; i < COUNT; i++)
        {
            list.add("1");
        }

    }

    public static void get10000(List list)
    {
        for (int i = 0; i < COUNT; i++)
        {
            list.get(i);
        }

    }

    public static void set10000(List list)
    {
        for (int i = 0; i < COUNT; i++)
        {
            list.set(i, "2");
        }

    }

    public static void remove10000(List list)
    {
//        System.out.println("1 size = "+list.size());
//        System.out.println("el 0 = "+list.get(0));
//        list.remove(0);
//        System.out.println("new size = "+list.size());
//        System.out.println("new el - = "+list.get(0));
//        System.out.println();
        for (int i = 0; i < COUNT; i++)
        {
            list.remove(0);
        }
    }
}


