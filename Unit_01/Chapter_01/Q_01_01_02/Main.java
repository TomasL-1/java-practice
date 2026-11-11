package Unit_01.Chapter_01.Q_01_01_02;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        double H = Double.parseDouble(scannerObj.nextLine());
        double W = Double.parseDouble(scannerObj.nextLine());
        double A = H * W;
        System.out.println(A);
        scannerObj.close();
    }
}
