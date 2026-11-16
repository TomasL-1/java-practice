package Unit_02.Chapter_02.Q_02_02_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int H = Integer.parseInt(scannerObj.nextLine());
        if (H <= 300){
            if (H >= 80){
                System.out.println("healthy");
            }else if (H >= 60){
                System.out.println("bloody nose");
            }else if (H >= 40){
                System.out.println("face swollen");
            }else if (H >= 20){
                System.out.println("eyes bloodshot, face bleeding");
            }else if (H >=1){
                System.out.println("even more blood");
            }else if (H == 0){
                System.out.println("eyes closed. Game Over");
            }
        }
        scannerObj.close();


    }
}