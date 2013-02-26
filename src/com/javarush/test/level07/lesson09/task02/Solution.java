package com.javarush.test.level07.lesson09.task02;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.02.13
 * Time: 14:49
 *
 * Введи с клавиатуры 5 слов в массив строк. Выведи их в обратном порядке.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
            list.add(reader.readLine());

        for (int i = list.size()-1; i >= 0; i--)
            System.out.println(list.get(i));

    }
}
