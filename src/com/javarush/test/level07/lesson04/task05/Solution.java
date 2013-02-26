package com.javarush.test.level07.lesson04.task05;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 25.02.13
 * Time: 15:09
 * To change this template use File | Settings | File Templates.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Создать массив на 20 чисел.
        // Ввести в него значения с клавиатуры.
        // Создать два массива на 10 чисел каждый.
        // Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        // Вывести второй маленький массив на экран.
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i ++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for(int i = 0; i < (arr.length/2); i++){
            arr1[i] = arr[i];
        }

        int j = 0;
        for(int i = (arr.length/2); i < arr.length; i++){
            arr2[j] = arr[i];
            j++;
        }

        for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);


    }
}
