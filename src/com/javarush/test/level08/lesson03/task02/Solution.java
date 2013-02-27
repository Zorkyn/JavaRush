package com.javarush.test.level08.lesson03.task02;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 27.02.13
 * Time: 21:00
 *
 * Создать коллекцию HashMap<String, String>,
 * занести туда 10 пар строк:
 *      арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
 * Вывести содержимое коллекции на экран.
 * Пример вывода (тут показана только одна строка):
 * Картофель - овощ
 */
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> el : map.entrySet())
            System.out.println(el.getKey() + " - " + el.getValue());

    }
}
