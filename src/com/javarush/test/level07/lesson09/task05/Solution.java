package com.javarush.test.level07.lesson09.task05;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.02.13
 * Time: 15:27
 *
 * Введи с клавиатуры 10 слов в массив строк.
 * Удвой их по принципу a,b,c -> a,a,b,b,c,c.
 * Выведи результат на экран.
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

        for (int i = 0; i < 10; i++)
            list.add(reader.readLine());

        int l = list.size()*2;
        for (int i = 0; i < l; i++){
            String s = list.get(i);
            list.add(i+1, s);
            i++;
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

    }
}
