package lesson2;

import java.util.concurrent.CopyOnWriteArraySet;

public class SwitchApp {

    public static void main(String[] args) {
        /*checkOrderStatus2("ACCEPTED");
        checkOrderStatus2("IN_DELIVERY");*/

    }

    public static void chekOrderStatus(String orderStatus) {
        if (orderStatus.equals("ACCEPTED")) {
            System.out.println("Принят");
        } else if (orderStatus.equals("DELIVERED")) {
            System.out.println("Доставлен");
        } else {
            System.out.println("Неизвестый статус заказа");
        }
    }


    public static void checkOrderStatus2(String orderStatus) {
        switch (orderStatus) {
            case "ACCEPTED" : {
                System.out.println("Принят");
                break;
            }
            case "DELIVERED" : {
                System.out.println("Доставлен");
                break;
            }
            default: {
                System.out.println("Неизвестый статус заказа");
            }
        }
    }
}
