package com.javarush.test.level07.lesson04.task01;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 24.02.13
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // Создать массив на 20 чисел.
        // Ввести с клавиатуры 20 чисел.
        //     Найти среди них максимальное, и вывести его на экран.

        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}


