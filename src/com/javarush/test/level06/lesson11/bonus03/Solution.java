package com.javarush.test.level06.lesson11.bonus03;

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
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        qSort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private static void qSort(int[] arr, int low, int hight){
        int i = low;
        int j = hight;
        int x = arr[(low+hight)/2];

        do {
            while(arr[i] < x)
                i++;
            while(arr[j] > x)
                j--;

            if (i <= j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }

        } while (i < j);

        if (j > low)
            qSort(arr, low, j);
        if (i < hight)
            qSort(arr, i, hight);


    }


}
