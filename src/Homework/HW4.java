package Homework;

public class HW4 {

    static int i = 2;

    public static void printTask() {

        System.out.println("Task " + ++i);
    }

    public static void main(String[] args) {


        printTask();

        System.out.println("Записать в виде кода следующие логические выражения" + "\n" +
                "(2 = 2) И (7 = 7)" + " На JAVA это - " + "(2==2) && (7==7)," + "\n" +
                "Не(15 < 3)" + " На JAVA это - " + "!(15 < 3)," + "\n"+
                "(Сосна = Дуб) ИЛИ (Вишня = Клён )" + "На JAVA это - " + "(Сосна == Дуб) || (Вишня = Клён )" + "\n"+
                "Не(Сосна = Дуб)" + "На JAVA это - " + "!=(Сосна = Дуб)" + "\n"+
                "(Не(15 < 3)) И (10 > 20)" + "На JAVA это - " + "(!(15 < 3)) && (10 > 20)" + "\n"+
                "(Глаза даны, чтобы видеть) И (Под третьим этажом находится второй этаж)" + "На JAVA это - " + "(Глаза даны, чтобы видеть) && (Под третьим этажом находится второй этаж)" + "\n"+
                "(6/2 = 3) ИЛИ (7*5 = 20)" + "На JAVA это - " + "(6/2 = 3) || (7*5 = 20)" + "\n"
        );




        printTask();
        System.out.println("Записать в виде кода следующие логические выражения" + "\n" +
                "Света младше Андрея и Наташи" + " На JAVA это - " + "Света < Андрея && Наташи" + "\n" +
                "На полке стоят учебники, а на столе лежат справочники" + " На JAVA это - " + "Полка = учебники, стол = справочники " + "\n" +
                "БОльшая часть детей — девочки. Остальные - мальчики" + " девочки > мальчиков" + "\n" );





        printTask();
        System.out.println("Записать в виде кода следующие логические выражения" + "\n" +
                "Водительские права можно получить, только когда исполнится 16 лет." + " На JAVA это - " + "права >= 16лет"+ "\n");

        printTask();
        System.out.println("Записать в виде кода следующие логические выражения" + "\n" +
                "Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно." + " На JAVA это - " + "Петя !ехать в автобусе = читает книгу || ! смотрит в окно"+ "\n");

        printTask();
        System.out.println("Записать выражения в виде условий if-else" + "\n" +
                "Если с другом ты, это хорошо, а когда наоборот - плохо" + " На JAVA это - " + "if(Ты с другом){хорошо;} else {плохо};" + "\n" );

        printTask();
        int x = -3;

        if (x > 10) {
            System.out.println("x больше 10 ");
            } else if (x < 0){System.out.println("x - отрицательное число");
                            } if (x ==5) {
            System.out.println("Разность x и 5 равна 0" );
        }
            else System.out.println("Число x меньше 11, больше или равно 0, но не равно 5");




        }

    }



