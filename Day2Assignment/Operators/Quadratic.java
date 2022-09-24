package Day2Assignment.Operators;

import static java.lang.Math.*;
import java.util.*;

public class Quadratic {
    static void calculateRoots(int a, int b, int c)
    {
        if (a == 0)
        {
            System.out.println("The value of a cannot be 0.");
            return;
        }
        int d = b * b - 4 * a * c;
        double sqrtval = sqrt(abs(d));
        if (d > 0)
        {
            System.out.println("The roots of the equation are real and different. \n");
            System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));
        }
        else if (d == 0)
        {
            System.out.println("The roots of the equation are real and same. \n");
            System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));
        }

        else
        {
            System.out.println("The roots of the equation are complex and different. \n");
            System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of a,b and c");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        calculateRoots(a, b, c);
    }
}
