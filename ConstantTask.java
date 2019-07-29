
import java.util.Scanner;
public class ConstantTask {
public static void main(String[] args) {
        System.out.println("Введите число number");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
final int X =0;
final int  Y=1;
final int Z=2;
if (number == X||number==Y||number==Z){
        System.out.println("Данное значение имеется в константах");
        }
else {
    System.out.println("Такой константы нет!");

}
}
}