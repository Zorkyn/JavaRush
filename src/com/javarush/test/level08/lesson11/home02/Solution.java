package com.javarush.test.level08.lesson11.home02;

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
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> set = new HashSet<Cat>();

        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());

        return set;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> set = new HashSet<Dog>();
        set.add(new Dog());
        set.add(new Dog());
        set.add(new Dog());

        return set;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> set = new HashSet<Object>();
        for (Cat cat : cats)
            set.add(cat);

        for (Dog dog : dogs)
            set.add(dog);

        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        for (Cat cat : cats)
            pets.remove(cat);
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object pet : pets)
        {
            System.out.println(pet);
        }

        System.out.println();
    }

    public static class Cat
    {

    }

    public static class Dog
    {

    }


}
