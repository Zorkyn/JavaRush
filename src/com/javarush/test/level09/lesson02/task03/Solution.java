package com.javarush.test.level09.lesson02.task03;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04.03.13
 * Time: 16:41
 * Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
 */

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static int method1()
    {
        method2();

        return Thread.currentThread().getStackTrace()[2].getLineNumber();

    }

    public static int method2()
    {
        method3();

        return Thread.currentThread().getStackTrace()[2].getLineNumber();

    }

    public static int method3()
    {
        method4();

        return Thread.currentThread().getStackTrace()[2].getLineNumber();

    }

    public static int method4()
    {
        method5();

        return Thread.currentThread().getStackTrace()[2].getLineNumber();

    }

    public static int method5()
    {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();

    }
}


