package thuchanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random=new Random();
        Integer[] array=new Integer[100];
        System.out.println("Elements in Array: ");
        for (int i=0;i<array.length;i++) {
            array[i]=random.nextInt(100);
            System.out.print(array[i]+"\t");
        }
        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[] array=arrayExample.createRandom();

        Scanner input=new Scanner(System.in);
        System.out.println("\nLet's enter index of any value: ");
        int x=input.nextInt();

        try {
            System.out.println("Value of element which has index "+x+" is "+array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is exceeded array.");
        }
    }
}
