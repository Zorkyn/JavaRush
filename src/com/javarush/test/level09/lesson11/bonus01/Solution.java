package com.javarush.test.level09.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(sourceFileName);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(destinationFileName);

        int count = 0;
        int c;
        while ((c = fileInputStream.read()) != -1)
        {
            fileOutputStream.write(c);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

}
