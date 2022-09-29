package Homework;

public class HW5 {

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }

    public static String returnDayOfWeek(int namberOfDay) {

        if (0 < namberOfDay || namberOfDay < 8) {
            if (namberOfDay == 1) {
                return "Понедельник";
            }
            if (namberOfDay == 2) {
                return "Вторник";
            }
            if (namberOfDay == 3) {
                return "Среда";
            }
            if (namberOfDay == 4) {
                return "Четверг";
            }
            if (namberOfDay == 5) {
                return "Пятница";
            }
            if (namberOfDay == 6) {
                return "Суббота";
            }
            if (namberOfDay == 7) {
                return "Воскресенье";
            }
        }
        return "Error";
    }


    public static void main(String[] args) {

        System.out.println(returnDayOfWeek(5));

    }


}
