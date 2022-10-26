package CodingBatLogic1.Part2;

public class lastDigit {

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
