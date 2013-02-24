package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, sum = 0;
        while (i != -1)
        {
            i = Integer.parseInt(br.readLine());
            sum = sum + i;
            //i = Integer.parseInt(br.readLine());
            //int i2 = i;
            if (i == -1)
            {
                System.out.println(sum);
            }

        }
    }
}
