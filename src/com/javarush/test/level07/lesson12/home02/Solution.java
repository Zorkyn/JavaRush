package com.javarush.test.level07.lesson12.home02;

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
        for (int i = 0; i < 10; i++)
            list.add(reader.readLine());

        list.add(list.get(0));
        list.remove(0);
        list.add(list.get(0));
        list.remove(0);
        list.add(list.get(0));
        list.remove(0);

        for (int j = 0; j < list.size(); j++)
            System.out.println(list.get(j));

    }
}
