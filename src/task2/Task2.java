package task2;

/**..
 * Создать программу,которая будет вычислять и выводить на экран наименьшее общее кратное и наибольший общий делитель
 * двух целых чисел введенных пользователем если пользовательнекоректно введет хотябы одно из числе - сообщать об ошибке
 */
public class Task2 {

    public static void main(String[] args) {
        //введите числа
        int number1 = 5;
        int number2 = 25;
        if (number1 <= 0 || number2 <= 0) throw new UnsupportedOperationException("некорректный ввод");
        //НОД

        int min;
        int nod = 0;
        if (number1 < number2) {
            min = number1;
        } else min = number2;
        for (int i = 1; i < min; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                if (i > nod) nod = i;
            }
        }
        System.out.println("НОД равен " + nod);

        //НОК

        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) number1 = number1 % number2;
            else number2 = number2 % number1;
        }
        System.out.println("НОК равен " + (number1 + number2));

    }
}


