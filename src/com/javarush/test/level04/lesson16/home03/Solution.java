package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0, sum = 0;
        while (i != -1)
        {
            i = Integer.parseInt(br.readLine());
            sum = sum + i;
            if (i == -1){
                System.out.println(sum);
            }
        }
    }
}
