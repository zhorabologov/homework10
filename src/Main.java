public class Main {
    public static void main(String[] args) {
        //task1

        int year = 2020;
        boolean yearLeap = isYearLeap(year);
        System.out.println(year + " год — високосный год». Если год невисокосный, то:" + yearLeap +  "год — невисокосный год");
    }


        public static boolean isYearLeap(int year) {
            if ((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) ;
            return true;
        } else {
        return false
    }

    }







}