package CodingBatLogic1.Part2;

public class lastDigit {


    /*
    Given three ints, a b c, return true if two or more of them have the same rightmost digit.
    The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
     */

    public boolean lastDigit(int a, int b, int c) {

        a = a % 10;
        b = b % 10;
        c = c % 10;

        if (a == b || a == c || b == c)
            return true;
        else
            return false;

    }

}
