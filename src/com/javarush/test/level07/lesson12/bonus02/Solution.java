package com.javarush.test.level07.lesson12.bonus02;

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

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listR = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String tmp = list.get(i);
            if (tmp.length() % 2 == 0)
            {
                tmp = tmp + " " + tmp;
            } else
            {
                tmp = tmp + " " + tmp + " " + tmp;
            }
            listR.add(tmp);
        }

        for (int i = 0; i < listR.size(); i++)
        {
            System.out.println(listR.get(i));
        }

//        ArrayList<String> listUpperCase = new ArrayList<String>();
//        for (int i = 0; i < list.size(); i++)
//        {
//            String s = list.get(i);
//            listUpperCase.add(s.toUpperCase());
//        }
//
//        for (int i = 0; i < listUpperCase.size(); i++)
//        {
//            System.out.println(listUpperCase.get(i));
//        }
    }
}
