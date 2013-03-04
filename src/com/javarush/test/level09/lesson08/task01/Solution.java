package com.javarush.test.level09.lesson08.task01;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 04.03.13
 * Time: 21:56
 *
 */

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.HashMap;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try {

        method1();

        }
        catch (NullPointerException e) {

        }
        catch (FileNotFoundException e) {

        }

    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException
    {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}


