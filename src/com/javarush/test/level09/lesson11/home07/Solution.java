package com.javarush.test.level09.lesson11.home07;

/**
 * User: General
 * Date: 12/21/12
 * Time: 11:59 PM
 */
public class Solution
{
    public int A = 5;
    public int B = 2 * A;
    public int C = A * B;
    public int D = A * B;

    public void main(String[] args)
    {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA()
    {
        return A;
    }

}
