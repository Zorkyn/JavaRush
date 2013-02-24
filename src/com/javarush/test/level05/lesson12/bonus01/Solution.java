package com.javarush.test.level05.lesson12.bonus01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;

        try
        {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
        }
        catch (IOException ep)
        {
            System.out.println("parse exception");
        }

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
