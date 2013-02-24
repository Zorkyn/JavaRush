package com.javarush.test.level05.lesson12.home02;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Piter", 15, "Chickago");
        Man man2 = new Man("Semen", 25, "Moscow");

        Woman woman1 = new Woman("Kate", 18, "Chickago");
        Woman woman2 = new Woman("Nastya", 21, "Moscow");

    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
}
