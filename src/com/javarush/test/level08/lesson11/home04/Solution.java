package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 4; i++)
        {
            int tmp = Integer.parseInt(reader.readLine());
            if (min > tmp)
                min = tmp;
        }

               System.out.println(min);
    }
}
