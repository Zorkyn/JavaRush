package com.javarush.test.level08.lesson06.task04;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 22:09
 *
 * Измерить сколько времени занимает 10 тысяч вызовов get для каждого массива.
 * Функция getTimeMsOfGet  должна вернуть время ее исполнения в миллисекундах.
 */

import java.util.Date;
import java.util.List;

public class Solution
{
    public static long  getTimeMsOfGet(List list)
    {
        Date startDate = new Date();

        get10000(list);

        Date currentDate = new Date();
        long msDiff = currentDate.getTime() - startDate.getTime();

        return  msDiff;

    }

    public static void get10000(List list)
    {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++)
        {
            list.get(x);
        }
    }
}


