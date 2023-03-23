public class Main {
    public static void main(String[] args) {
        int year = 2021;
        boolean yearLeap = isYearLeap (year);
        System.out.println (yearLeap + " год — високосный год». Если год невисокосный, то:" + year + "год — невисокосный год");
    }

    public static boolean isYearLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

