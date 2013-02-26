package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 25.02.13
 * Time: 14:36
 * To change this template use File | Settings | File Templates.
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // Создать массив на 10 строчек.
        // Ввести с клавиатуры 8 строчек и сохранить их в массив.
        // Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i ++){
            arr[i] = reader.readLine();
        }

        for (int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }


    }
}
