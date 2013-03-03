package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        String s = reader.readLine();
        String str = "";
        for (int i = 0; i < s.length(); i++)
        {
            String tmp = s.substring(i, i + 1);
            if (i == 0) { // || (i != 0 && s.substring(i-1, i) == " ")){
                str += tmp.toUpperCase();
            } else {
                String tt = s.substring(i - 1, i);
                if (" ".equals(tt))
                {
                    str += tmp.toUpperCase();
                } else
                {

                    str += tmp;
                }
            }
        }
        System.out.println(str);


    }
}