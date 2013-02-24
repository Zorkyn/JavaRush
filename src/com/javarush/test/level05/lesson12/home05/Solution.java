package com.javarush.test.level05.lesson12.home05;

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

        String input  = br.readLine();
        int sum = 0;
        while (!"сумма".equals(input)){
            sum = sum + Integer.parseInt(input);
            input = br.readLine();
        }
        System.out.println(sum);

    }
}
