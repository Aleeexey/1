import java.util.Scanner;
public class Etable {
    public static void main(String[] args) {
        System.out.println("Введите число и система выдаст таблицу умножения");
        Scanner scan=new Scanner(System.in);
        int number = scan.nextInt();
        String a ="x1=";
        String b ="x2=";
        String c ="x3=";
        String d="x4=";
        String e ="x5=";
        String f ="x6=";
        String g ="x7=";
        String h ="x8=";
        String i ="x9=";
        String j ="x10=";
        System.out.println(number+a+number);
        System.out.println(number+b+number*2);
        System.out.println(number+c+number*3);
        System.out.println(number+d+number*4);
        System.out.println(number+e+number*5);
        System.out.println(number+f+number*6);
        System.out.println(number+g+number*7);
        System.out.println(number+h+number*8);
        System.out.println(number+i+number*9);
        System.out.println(number+j+number*10);

    }
}
