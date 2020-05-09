package task1;

/**
 * Создать программу,которая будет сообщать,является-ли целое число введенное пользователем,четным или нечетным,простым или
 * составным. если пользователь введет не целое число,то сообщать ему об ошибке
 */
public class Task1 {

    public static void main(String[] args) {

        int chislo = 4213529; //Введите целое число

        if (chislo % 2 == 0) {
            System.out.println("Число является четным");
        } else {
            System.out.println("Число является нечетным");
        }

        int i;
        for (i = 2; i < chislo; i++) {
            if (chislo % i == 0) {
                System.out.println("Число является cоставным");
                return;
            }
        }
        System.out.println("да,это простое число");

    }
}



