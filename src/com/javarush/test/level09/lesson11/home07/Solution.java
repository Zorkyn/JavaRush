package com.javarush.test.level09.lesson11.home07;


/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    static public int A = 5;
    static public int B = 2 * A;
    public int C = A * B;
    static public int D = A * B;

    public static void main(String[] args)
    {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    // TODO not passed test
    private int getA()
    {
        return A;
    }

}
