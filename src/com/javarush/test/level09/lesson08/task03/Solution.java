package com.javarush.test.level09.lesson08.task03;

/**
 * Created with IntelliJ IDEA.
 * User: Zork
 * Date: 04.03.13
 * Time: 22:13
 * To change this template use File | Settings | File Templates.
 */

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try{

           // method1();

        }
        catch (Exception e){
            if ("java.lang.Exception2".equals(e.toString()))
                //e.equals();
                throw e;
        }


    }
    /*
    public static void method1() throws Exception1, Exception2, Exception3
    {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
    */
}


