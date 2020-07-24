import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation ax+b=0, please figure out value of 'x'!");

        Scanner input=new Scanner(System.in);
        System.out.println("Let's enter 'a':");
        double a=input.nextDouble();
        System.out.println("Let's enter 'b': ");
        double b=input.nextDouble();

        if (a!=0) {
            double x=-b/a;
            System.out.printf("x = %f",x);
        } else {
            System.out.println("There is no 'x' satisfied.");
        }
    }
}
