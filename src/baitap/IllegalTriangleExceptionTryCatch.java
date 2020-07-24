package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleExceptionTryCatch {
    private double a,b,c;

    public IllegalTriangleExceptionTryCatch() {

    }

    public IllegalTriangleExceptionTryCatch(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public void illegalTriangle() {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a: ");
        a=input.nextDouble();
        System.out.println("Enter b: ");
        b=input.nextDouble();
        System.out.println("Enter c: ");
        c=input.nextDouble();

        try {
            if (a<=0||b<=0||c<=0||a+b<=c||b+c<=a||c+a<=b);
        } catch (InputMismatchException e) {
            System.out.println("Invalid value-Thuy");
        }
    }

    public static void main(String[] args) {
        IllegalTriangleExceptionTryCatch tri=new IllegalTriangleExceptionTryCatch();
        tri.illegalTriangle();
    }
}
