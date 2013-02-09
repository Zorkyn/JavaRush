package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] a1 = new int[5];
        int[] a2 = new int[2];
        int[] a3 = new int[4];
        int[] a4 = new int[7];
        int[] a5 = new int[0];
        fillArray(a1);
        fillArray(a2);
        fillArray(a3);
        fillArray(a4);
        fillArray(a5);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        return list;
    }

    private static void fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
