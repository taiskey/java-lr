
import java.util.Scanner;


public class third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите число х: ");
        int x = scanner.nextInt();
        System.out.println("ВВедите степень n(-15 < n < 15): ");
        int n = scanner.nextInt();
        if (n<=-15 || n>=15) {
            System.out.println("error");
        }
        else {
            System.out.println(Math.pow(x, n));
        }
        }

    }





