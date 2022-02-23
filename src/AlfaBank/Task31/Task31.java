package AlfaBank.Task31;
import java.util.Scanner;

public class Task31 {
    public static void main (String[] args) {
        System.out.println("Enter the mass in lb.");
        Scanner scanner = new Scanner(System.in);
                int newfut = scanner.nextInt();
        double mas = 0.4536;
        double kilos = mas*newfut;
        System.out.println("kilos = "+kilos);
        int kilo = (int)kilos;
        double gram = kilos - kilo;
        System.out.println("kilo = "+kilo);
        System.out.println("gram = "+gram);
    }
}
