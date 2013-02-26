package com.javarush.test.level07.lesson06.task03;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.02.13
 * Time: 11:28
 *
 * Создай список строк.
 * Добавь в него 5 строчек с клавиатуры.
 * Расположи их в обратном порядке. Выведи содержимое на экран.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
            list.add(reader.readLine());

        for (int i = 0; i < list.size(); i++){
            list.add(i, list.get(list.size()-1));
            list.remove(list.size()-1);
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}
