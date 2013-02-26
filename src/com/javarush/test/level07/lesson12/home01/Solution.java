package com.javarush.test.level07.lesson12.home01;

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

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(reader.readLine());

        for (int j = arr.length-1; j >=0; j--)
            System.out.println(arr[j]);

    }
}
