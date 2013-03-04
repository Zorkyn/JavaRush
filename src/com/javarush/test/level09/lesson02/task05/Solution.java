package com.javarush.test.level09.lesson02.task05;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04.03.13
 * Time: 17:14
 *
 * Написать функцию, которая возвращает результат – глубину её стек трейса – количество функций в нем (количество элементов в списке).
 * Это же число функция должна выводить на экран.
 */
public class Solution
{
    public static int getStackTraceDeep()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        int deep = stack.length;
        System.out.println(deep);
        return deep;

    }
}
