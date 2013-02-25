package com.javarush.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 14.02.13
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
public class test01
{
    public static void main(String[] args) throws IOException
    {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = 0;
        while (i < 15){
            System.out.println(s);
        }

    }
}
