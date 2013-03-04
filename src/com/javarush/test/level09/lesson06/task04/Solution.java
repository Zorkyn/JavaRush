package com.javarush.test.level09.lesson06.task04;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 04.03.13
 * Time: 21:51
 *
 * Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 *      ArrayList<String> list = new ArrayList<String>();
 *      String s = list.get(18);
 */
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
