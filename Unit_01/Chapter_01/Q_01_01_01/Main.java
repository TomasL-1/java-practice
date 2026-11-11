package Unit_01.Chapter_01.Q_01_01_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        String N = scannerObj.nextLine();
        String G = "Good evening, " + N + "!";
        System.out.println(G);
        scannerObj.close();
    }
}
