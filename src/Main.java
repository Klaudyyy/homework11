//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        checkLeapYear(2026);
        softwareDefinition(2016, 0);
        int days = calculationOfDelivery(95);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        }
    }

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");

        }
    }

    public static void softwareDefinition(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию для iOS");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите обычную версию для Android");
        }
    }
    public static int calculationOfDelivery (int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
            return 0;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100)  {
            deliveryDays += 2;
        }
        return deliveryDays;
    }
}