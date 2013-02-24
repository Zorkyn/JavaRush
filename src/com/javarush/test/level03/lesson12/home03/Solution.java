package com.javarush.test.level03.lesson12.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Я буду зарабатывать 50$ в час
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int i = Integer.parseInt(s);

        System.out.println("Я буду зарабатывать $" + i + " в час");

    }
}