

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input binary number: ");
        String bin = sc.nextLine();
        int binNum = Integer.parseInt(bin,2);

        System.out.println(binNum);
    }

}
