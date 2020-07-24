package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    private double a,b,c;

    public IllegalTriangleException() {

    }

    public IllegalTriangleException(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void triangle(double a, double b, double c) {
        if (a<=0||b<=0||c<=0)
            throw new InputMismatchException("Invalid value-Thùy.");
        double[] arr= {a,b,c};
        double max=arr[0];
        for (int i=1;i<arr.length;i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        if (max>=(a+b+c)/2)
            throw new InputMismatchException("Invalid value-Thùy.");
        System.out.println("Triangle: side 1="+a+"; side2="+b+"; side3="+c);
    }

    public static void main(String[] args) {
        IllegalTriangleException tri=new IllegalTriangleException();

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=input.nextDouble();
        System.out.println("Enter b: ");
        double b=input.nextDouble();
        System.out.println("Enter c: ");
        double c=input.nextDouble();

        tri.triangle(a,b,c);
    }
}
