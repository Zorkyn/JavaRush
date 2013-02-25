package com.javarush.test.level06.lesson11.home06;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args)
    {
        KissMyShinyMetalAss k = new KissMyShinyMetalAss();
        System.out.println(k);
    }

    public static class KissMyShinyMetalAss
    {
        public static int count = 0;

        public KissMyShinyMetalAss(){
            count++;
        }


    }

}
