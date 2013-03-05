package com.javarush.test.level09.lesson11.home02;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 10; i >= 0; i--)
        {
            System.out.println(i);

            // TODO not passed test
            try {
                Thread.sleep(1000);
            } catch (Exception e)
            {
                System.out.println("except = "+i);
            }
        }
    }
}
