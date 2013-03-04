package com.javarush.test.level09.lesson06.task03;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 04.03.13
 * Time: 21:49
 *
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 *      int[] m = new int[2];
 *      m[8] = 5;
 */

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

            int[] m = new int[2];
            m[8]= 5;

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}


