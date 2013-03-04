package com.javarush.test.level08.lesson11.home06;

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
        Human grandFather1 = new Human("grandFather1", true, 60);
        Human grandFather2 = new Human("grandFather2", true, 62);
        Human grandMother1 = new Human("grandMother1", false, 59);
        Human grandMother2 = new Human("grandMother2", false, 57);
        Human father = new Human("father", true, 38);
        Human mother = new Human("mother", false, 39);
        Human son1 = new Human("son1", true, 17);
        Human son2 = new Human("son2", true, 14);
        Human daughter = new Human("daughter", false, 9);
        grandFather1.setHumanChild(father);
        grandMother1.setHumanChild(father);
        grandFather2.setHumanChild(mother);
        grandMother2.setHumanChild(mother);
        father.setHumanChild(son1);
        father.setHumanChild(son2);
        father.setHumanChild(daughter);
        mother.setHumanChild(son1);
        mother.setHumanChild(son2);
        mother.setHumanChild(daughter);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        private void setHumanChild(Human child){
            this.children.add(child);
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
