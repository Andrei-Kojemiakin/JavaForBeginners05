package Homework;

public class HW5 {



//    public static verify(int expectedResult, int actualResult) {
//        if (expectedResult == actualResult) {
//            System.out.println("PASS");
//        } else {
//            System.out.println("FAIL");
//        }
//
//    }
    public static String verify (String expectedResult, String actualResult) {
        if (expectedResult == actualResult) {
            return "PASS";
        } else {
            return "FAIL";
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

        int namber = 1;
String line =  "_________________________________________________________________________________________________________";
String task = "Задание " + namber;



        System.out.println(task + '\n');
        namber++;
        String expectedResult = "Воскресенье";
        String actualResult = returnDayOfWeek(7);

        System.out.println(verify(expectedResult,actualResult));


        expectedResult = "Error";
        actualResult = returnDayOfWeek(8);

        System.out.println(verify(expectedResult,actualResult));

        expectedResult = "Понедельник";
        actualResult = returnDayOfWeek(1);

        System.out.println(verify(expectedResult,actualResult));

        expectedResult = "Вторник";
        actualResult = returnDayOfWeek(2);

        System.out.println(verify(expectedResult,actualResult));


        expectedResult = "Среда";
        actualResult = returnDayOfWeek(3);

        System.out.println(verify(expectedResult,actualResult));

        expectedResult = "Четверг";
        actualResult = returnDayOfWeek(4);

        System.out.println(verify(expectedResult,actualResult));

        expectedResult = "Пятница";
        actualResult = returnDayOfWeek(5);

        System.out.println(verify(expectedResult,actualResult));

        expectedResult = "Суббота";
        actualResult = returnDayOfWeek(6);

        System.out.println(verify(expectedResult,actualResult));

        System.out.println(line);
    }



}
