package com.javarush.test.level09.lesson06.task01;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 04.03.13
 * Time: 17:50
 * <p/>
 * Перехватить исключение (и вывести его на экран),
 * указав его тип, возникающее при выполнении кода: int a = 42 / 0;
 */

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {

            int a = 42 / 0;
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
