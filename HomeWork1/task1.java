package HomeWork1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Введите любое число: ");
       int input = in.nextInt();

       int summ = 0;
       int fakt = 1;
       int[] array = new int[input]; 

       for (int i = 0; i < input; i++) {
        array[i] = i + 1;
       }

       for (int i = 0; i < array.length; i++) {
        summ = summ + array[i];
        fakt = fakt*array[i];
       }

        System.out.println("n-ое треугольного число: " + summ);
        System.out.println("произведение чисел: " + fakt);
    }
}
