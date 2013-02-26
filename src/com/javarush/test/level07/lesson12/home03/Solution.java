package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int minimum = 0;
        int[] list = new int[20];

        for (int i = 0; i < list.length; i++)
            list[i] = (Integer.parseInt(reader.readLine()));

        maximum = list[0];
        minimum = list[0];

        for (int i = 0; i < list.length; i++)
        {
            if (maximum < list[i])
                maximum = list[i];
            if (minimum > list[i])
                minimum = list[i];
        }


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
