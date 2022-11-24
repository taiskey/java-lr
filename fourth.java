
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите кол-во точек: ");
        int n = scanner.nextInt();
        System.out.println("ВВедите радиус окружности: ");
        int rad = scanner.nextInt();
        int g = 0;
        while (n > 0) {
            n -= 1;
            g++;
            System.out.println("ВВедите x" + g);
            int x = scanner.nextInt();
            System.out.println("ВВедите y" + g);
            int y = scanner.nextInt();
            int h = 2;
            if ((x * x) + (y * y) <= Math.pow(rad, h))
                System.out.println("true");
            else
                System.out.println("false");
            if (n == 0)
                break;


        }
    }
}
