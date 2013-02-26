package com.javarush.test.level07.lesson09.task01;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.02.13
 * Time: 14:41
 * Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём массивам:
 * Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные. Выведи эти три массива на экран.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
            list.add(Integer.parseInt(reader.readLine()));

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (Integer el : list){
            if (el % 3 == 0){
                list1.add(el);
            } else if (el % 2 == 0){
                list2.add(el);
            } else {
                list3.add(el);
            }
        }

        for (int i = 0; i < list1.size(); i++)
            System.out.println(list1.get(i));
        for (int i = 0; i < list2.size(); i++)
            System.out.println(list2.get(i));
        for (int i = 0; i < list3.size(); i++)
            System.out.println(list3.get(i));

    }
}
