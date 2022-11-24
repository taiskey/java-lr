
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите год рождения: ");
        int y = scanner.nextInt();
        int yearsOld = 2022 - y;
 //       System.out.println(yearsOld + " лет");
        System.out.println("ВВедите месяц рождения: ");
        int m = scanner.nextInt();
        int b;
        if (m == 12) {
            b=11;
        }
        else {
            b = 11-m;
        }
 //       System.out.println(b + " месяцев");
        System.out.println("ВВедите день рождения: ");
        int day;
        int d = scanner.nextInt();
        if (d<=17) {
            day = 17-d;
        }
        else {
            day = 30-d;
        }
        System.out.println(yearsOld + " лет " + b + " месяца " + day + " дней ");
    }
}



