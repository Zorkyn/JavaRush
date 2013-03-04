package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

        //list of addresses
        HashMap<String, String> addresses = new HashMap<String, String>();
        while (true)
        {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            String house = reader.readLine();
            addresses.put(family, house);
        }

        //read home name
        String house = reader.readLine();
        if (addresses.containsKey(house))
        {
            System.out.println(addresses.get(house));
        }

    }
}
