package com.javarush.test.level06.lesson11.home02;

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
        //Напишите тут ваш код
        for (int i = 0; i < 10; i++)
            new Cat();

        for (int i = 0; i < Cat.cats.size(); i++)
        {
            System.out.println(Cat.cats.get(i));
        }

    }

    public static class Cat
    {
        //Напишите тут ваш код
        public static ArrayList<Cat> cats = new ArrayList<Cat>();

        public Cat()
        {
            cats.add(this);
        }
    }

}
