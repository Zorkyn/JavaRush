package com.javarush.test.level08.lesson08.task01;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 22:19
 * Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
 */
import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < 20; i++){
            set.add("Л"+Math.random());
        }

        return set;

    }
}
