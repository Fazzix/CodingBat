package CodingBatLogic1.Part2;

public class blueTicket {

    public int blueTicket(int a, int b, int c) {

        int ab = a + b, bc = b + c, ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10)
            return 10;

        if (ab == bc + 10 || ab == ac + 10)
            return 5;
        return 0;



    }




}
