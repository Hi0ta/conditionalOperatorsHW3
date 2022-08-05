import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1

         int clientOS = 0;
        if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        int ClientOS = 1;
        int clientDeviceYear = 2015;
        if (ClientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (ClientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android  по ссылке");}
            else {
                System.out.println("Установите версию приложения для Android  по ссылке");
            }


        }
    }

}