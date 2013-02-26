package com.javarush.test.level07.lesson04.task03;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 25.02.13
 * Time: 14:47
 * To change this template use File | Settings | File Templates.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // Создать массив на 10 чисел.
        // Ввести с клавиатуры 10 строк.
        // В массив чисел, в каждую ячейку записать длину строки из массива строк, с таким же индексом/номером ячейки.
        // Вывести содержимое массива чисел на экран.

        String[] arr = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i ++){
            arr[i] = reader.readLine();
        }
        int[] iArr = new int[10];
        for (int i = 0; i < arr.length; i++){
            iArr[i] = (arr[i] == null) ? 0 : arr[i].length();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(iArr[i]);
        }
    }
}
