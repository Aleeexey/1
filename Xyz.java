import java.util.Scanner;
public class Xyz {
    public static void main(String[] args) {
        System.out.println("Введите поочередно три числа");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println((x + y + z) / 3.0);
        System.out.println(((x + y + z) / 3) / 2.0);
        if ((((x + y + z) / 3.0) / 2.0)>3) {
            System.out.println("Программа выполнена корректно");

        }
    }
}
