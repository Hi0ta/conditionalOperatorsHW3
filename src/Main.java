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

        int ClientOS = 0;
        int clientDeviceYear = 2013;
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
        if (deliveryDistance <= distance) {
        } else {
            day = day + (int) Math.ceil((deliveryDistance - distance) / (double) interval);
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
        // задание 6
        {
            int age = 19;
            int salary = 58_000;
            double creditLimit = 1.0;
            boolean conditionSalary1 = salary > 80_000;
            boolean conditionSalary2 = salary > 50_000;
            boolean conditionAge = age >= 23;
            if (conditionAge) {
                creditLimit = salary * 3;
            } else {
                creditLimit = salary * 2;
            }
            if (conditionSalary1) {
                creditLimit *= 1.5;
            } else if (conditionSalary2) {
                creditLimit *= 1.2;
            }
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
        }

        // задание 7
        int age = 25;
        int salary = 70_000;
        int wantedSum = 330_000;
        double baseRate = 10.0;
        int creditPeriodMonths = 12;
        double maxMonthlyPayment = salary / 2;
        boolean conditionAge1 = age < 23;
        boolean conditionAge2 = age >= 23 && age < 30;
        boolean conditionSalary = salary > 80_000;

        if (conditionAge1) {
            baseRate++;
        }
        if (conditionAge2) {
            baseRate = baseRate + 0.5;
        }
        if (conditionSalary) {
            baseRate = baseRate - 0.7;
        }
        double standardCreditPayment = (wantedSum + wantedSum * baseRate / 100) / creditPeriodMonths;
        boolean creditAgreed = maxMonthlyPayment >= standardCreditPayment;
        if (creditAgreed) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Ежемесячный платеж по кредиту составит " + standardCreditPayment + " рублей. Кредит одобрен");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. Ежемесячный платеж по кредиту составит " + standardCreditPayment + " рублей. В кредите отказано");
        }


    }
}