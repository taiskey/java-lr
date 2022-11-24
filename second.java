
import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите день: ");
        int d = scanner.nextInt();
        while (d>31 || d<=0) {
            System.out.println("error, try again");
            int day = scanner.nextInt();
            if (d <= 31 || d >= 1)
                break;
        }

        System.out.println("ВВедите номер месяца: ");
        int m = scanner.nextInt();

        if (m==1 || m==2 || m==12) {
            System.out.println("время года: зима");
        }
        if (m==3 || m==4 || m==5) {
            System.out.println("время года: весна");
        }
        if (m==6 || m==7 || m==8) {
            System.out.println("время года: лето");
        }
        if (m==9 || m==10 || m==11) {
            System.out.println("время года: осень");
        }
    }

}
