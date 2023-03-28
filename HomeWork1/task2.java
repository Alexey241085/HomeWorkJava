package HomeWork1;


// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        int lg = 1000;
        
        int num = 0; 
        for (int i = 0; i < lg; i++) {
            num = i + 1;
            if (num%2==0 || num%3==0 && num!=3 || num%5==0 && num!=5 || num%7==0 && num!=7)
            continue;
            System.out.println(num);
        }
    }   
}
