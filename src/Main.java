import java.time.LocalDate;

public class Main {
    public static boolean main(String[] args) {
        // task1
        int year = 2021;
        boolean yearLeap = isYearLeap (year) {
            System.out.println (yearLeap + " год — високосный год». Если год невисокосный, то:" + year + "год — невисокосный год");
        }

        //task2

        determineTypeOC (type 0, clientDeviceYear 2015) {
        }


        //task3
        int distance = 95;
        int time = intervalTime (distance);
        System.out.println ("Потребуется дней: " + time + " срок доставки " + distance) {
        }


        public static boolean isYearLeap(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }


    public static void determineTypeOC(int type, int clientDeviceYear) {
        int currentYear = LocalDate.now ().getYear ();

        if (type == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println ("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println ("Установите стандартную версию на iOS");
            }

        } else if (type == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println ("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println ("Установите стандартную версию на Android");
            }
        }
    }

    public static int intervalTime(int distance) {
        if (distance > 100) {
            return -1;
        }
        int time = 1;
        if (distance >= 20) {
            ++time;
        }
        if (distance >= 60) {
            ++time;
        }
        if (distance <= 100) {
            ++time;
        }
        return time;

    }
}
}