package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        sort(arr);
        int maximum = arr[0];

        System.out.println(maximum);
    }


    public static void sort(int[] arr)
    {


        for (int i = arr.length-1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] < arr[j + 1])
                {
                    swap(arr, j, j + 1);
                }
            }

        }

    }

    static void swap(int[] arr, int i, int j)
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
