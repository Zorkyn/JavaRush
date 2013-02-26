package com.javarush.test.level07.lesson06.task05;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.02.13
 * Time: 11:51
 *
 * Создай список строк.
 * Добавь в него 5 строчек с клавиатуры.
 * Удали последнюю строку и вставь её в начало. Повторить 13 раз. Выведи содержимое на экран.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
            list.add(reader.readLine());

        for (int i = 0; i < 13; i++){
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}
