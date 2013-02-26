package com.javarush.test.level07.lesson04.task04;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 25.02.13
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Создать массив на 10 чисел.
        //Ввести с клавиатуры 10 чисел и записать их в массив.
        //Расположить элементы массива в обратном порядке.
        //Вывести результат на экран.
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i ++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        int[] arr2 = new int[10];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--){
            arr2[j] = arr[i];
            j++;
        }

        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

    }
}