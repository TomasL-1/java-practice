package Unit_02.Chapter_03.Q_02_03_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int n = Integer.parseInt(scannerObj.nextLine());
        int minVal = Integer.parseInt(scannerObj.nextLine());
        int maxVal = minVal;

        for (int i = 1; i < n; i++) {
            int current = Integer.parseInt(scannerObj.nextLine());
            minVal = Math.min(minVal, current);
            maxVal = Math.max(maxVal, current);
        }

        System.out.println("min: " + minVal);
        System.out.println("max: " + maxVal);

        scannerObj.close();

    }
}