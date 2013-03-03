package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 5; i++) {
            int tmp = Integer.parseInt(reader.readLine());
            set.add(tmp);
        }

        int min = 0;
        for (int el : set){
            if (min > el)
                min = el;
        }

        System.out.println(min);
    }
}
