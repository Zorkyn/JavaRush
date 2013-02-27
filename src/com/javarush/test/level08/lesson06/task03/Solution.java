package com.javarush.test.level08.lesson06.task03;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 22:04
 * Измерить сколько времени занимает 10 тысяч вставок для каждого массива.
 * Функция getTimeMsOfInsert должна вернуть время ее исполнения в миллисекундах.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution
{
    public static long  getTimeMsOfInsert(List list)
    {
        Date startDate = new Date();

        insert10000(list);

        Date currentDate = new Date();
        long msDiff = currentDate.getTime() - startDate.getTime();

        return  msDiff;

    }

    public static void insert10000(List list)
    {
        for (int i=0;i<10000;i++)
        {
            list.add(0, new Object());
        }
    }
}


