package by.yaroshuk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        while (true){
            if (scanner.hasNextInt()){
                int a = scanner.nextInt();
                System.out.println("Круто!!!" + a);
                break;
            }else {
                System.out.println("Ошибка! Попробуй еще!");
                scanner.next();
            }
        }


    }

}
