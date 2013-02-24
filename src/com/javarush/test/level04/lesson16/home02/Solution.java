package com.javarush.test.level04.lesson16.home02;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(br.readLine());
        int i2 = Integer.parseInt(br.readLine());
        int i3 = Integer.parseInt(br.readLine());

        int res;
        if ((i1 > i2 && i1 < i3) || (i1 > i3 && i1 < i2)) {
            res = i1;
        } else if ((i2 > i1 && i2 < i3) || (i2 > i3 && i2 < i1)) {
            res = i2;
        } else {
            res = i3;
        }
        System.out.println(res);
    }
}
