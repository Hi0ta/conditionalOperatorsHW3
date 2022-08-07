import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2

        int ClientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            System.out.print("Установите облегченную версию приложения для");
        } else {
            System.out.print("Установите версию приложения для");
        }
        if (ClientOS == 0) {
            System.out.println(" iOS по ссылке");
        } else {
            System.out.println(" Android по ссылке");
        }

    // Задание 3

    int year = 2100;
    boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    if (leapYear) {
        System.out.println("Это високосный год");
    } else {
        System.out.println("Это не високосный год");
    }
        // Задание 4
    int deliveryDistance = 95;
    int day = 1;
    int interval = 40;
    int distance = 20;
    if (deliveryDistance <= distance){
    } else {
        day = day + (int) Math.ceil((deliveryDistance-distance)/ (double) interval);
    }
        System.out.println("Потребуется дней: " + day);


    //if (deliveryDistance < distance) {
    //    System.out.println("Потребуется дней: " + day);
    //}else{
    //    day++;
   //     distance += 40;
    //    System.out.println("Потребуется дней: " + day);
   // }



        // day++;
      //distance += 40;
       // if (deliveryDistance < distance) {
         //   System.out.println("Потребуется дней: " + day);
        //} else  {
          //  day++;
           // distance += 40;
           // if (deliveryDistance < distance) ;
           // System.out.println("Потребуется дней: " + day);
        //}
   // }



        // задание 5
         int monthNumber = 6;
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default:
           // System.out.println("Такого месяца не существует");
    }



    }
}