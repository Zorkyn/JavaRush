package com.javarush.test.level06.lesson11.home01;

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




        System.out.println(Cat.catCount);
    }

    public static class Cat
    {
        //Напишите тут ваш код
        public static int catCount = 0;
        public Cat()
        {
            catCount++;
        }
    }

}
