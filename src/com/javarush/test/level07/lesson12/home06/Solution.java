package com.javarush.test.level07.lesson12.home06;

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
        ArrayList<Human> list = new ArrayList<Human>();

        list.add(new Human("grandFather1", true, 56, null, null));
        list.add(new Human("grandMother1", false, 51, null, null));
        list.add(new Human("grandFather2", true, 54, null, null));
        list.add(new Human("grandMother2", false, 50, null, null));
        list.add(new Human("father", true, 32, list.get(0), list.get(1)));
        list.add(new Human("mother", false, 28, list.get(2), list.get(3)));
        list.add(new Human("son1", true, 10, list.get(4), list.get(5)));
        list.add(new Human("son2", true, 6, list.get(4), list.get(5)));
        list.add(new Human("daughter", false, 2, list.get(4), list.get(5)));

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i).toString());

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
