import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи стороны прямоугольника: ");
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sulfid;
        sulfid = (a*b)*2*n;
        System.out.println("сульфида нужно: " + sulfid);



    }
}