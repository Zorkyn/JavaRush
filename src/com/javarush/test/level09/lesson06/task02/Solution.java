package com.javarush.test.level09.lesson06.task02;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 04.03.13
 * Time: 21:46
 *
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 *    String s = null;
 *    String m = s.toLowerCase();
 */

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

        String s = null;
        String m = s.toLowerCase();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}


