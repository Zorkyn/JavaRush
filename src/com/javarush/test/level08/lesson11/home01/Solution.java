package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Set;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        Cat cat1 = new Cat("cat1");
        cats.add(cat1);
        Cat cat2 = new Cat("cat2");
        cats.add(cat2);
        Cat cat3 = new Cat("cat3");
        cats.add(cat3);

        cats.remove(cat1);

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> set = new HashSet<Cat>();

        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat cat: cats)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        String name;

        public Cat(String name){
            this.name = name;
        }


    }


}
