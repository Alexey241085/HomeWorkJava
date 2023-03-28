package HomeWork1;
import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task3 {

    public static void main(String[] args) {

        char symbol;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();

        System.out.print("Введите знак '*', '/' , '+', '-': ");
        symbol = in.next().charAt(0);
        System.out.println(symbol);
        double result =0;
        String q = "ERROR";

        switch (symbol) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
        
            default:
                break;
        }
            System.out.println(result);
    }

}
        

