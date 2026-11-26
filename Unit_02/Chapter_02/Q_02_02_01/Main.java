package Unit_02.Chapter_02.Q_02_02_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scannerObj = new Scanner(System.in);
    int N = Integer.parseInt(scannerObj.nextLine());

    if ((N % 3) == 0){
        System.out.print("Fizz ");

        if ((N % 5) == 0){
            System.out.println("Buzz");
        }
    }else if ((N % 5 ) == 0){
        System.out.println("Buzz");
    }else{
        System.out.println(N);
    }
    scannerObj.close();
    }
}