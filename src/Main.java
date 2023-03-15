public class Main {
    public static void main(String[] args) {
        //task1

        int year = 2021;
        boolean yearLeap = isYearLeap(year);
        System.out.println(yearLeap + " год — високосный год». Если год невисокосный, то:" + year + "год — невисокосный год");
    }


    public static boolean isYearLeap(int year) {
        if ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) ;
        return true;
    }else

    {
        return false;

        // task2

        public static void searchYearAndIOS () {
        System.out.println();
        int clientIOS = 0;
        int clientDeviceYear = 2012;
        if (clientIOS == 0 && clientDeviceYear > 2015) printIOS();
        if (clientIOS == 1 && clientDeviceYear < 2015) printIOSTwo();
        if (clientIOS == 0 && clientDeviceYear > 2015) printAndroid();
        if (clientIOS == 0 && clientDeviceYear > 2015) printAndroidTwo();

        // task3

        public static String term ( int deliveryDistance){
            int deliveryTerm = 1;
            if deliveryDistance > 100 {
                deliveryTerm--;

                if (deliveryDistance >= 20) {
                    deliveryTerm++;
                }
                if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    deliveryTerm++;
                }
                return ("Дней доставки: " + deliveryTerm);

            }
        }
    }


    }


}


