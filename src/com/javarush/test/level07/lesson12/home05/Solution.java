package com.javarush.test.level07.lesson12.home05;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 30; i >= 0; i--)
        {
            System.out.println(i);

            if (i % 3 ==0)
                Thread.sleep(100);

        }

        System.out.println("Бум!");
    }
}
