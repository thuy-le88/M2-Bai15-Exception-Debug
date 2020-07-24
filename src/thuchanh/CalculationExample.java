package thuchanh;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x,int y) {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        try {
            int a=x+y;
            int b=x-y;
            int c=x*y;
            int d=x/y;
            System.out.println("x + y = "+a);
            System.out.println("x - y = "+b);
            System.out.println("x * y = "+c);
            System.out.println("x / y = "+d);
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's enter x: ");
        int x=input.nextInt();
        System.out.println("Let's enter y: ");
        int y=input.nextInt();

        CalculationExample cal=new CalculationExample();
        cal.calculate(x,y);
    }
}
