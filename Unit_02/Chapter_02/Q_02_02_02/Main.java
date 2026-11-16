package Unit_02.Chapter_02.Q_02_02_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        String C = scannerObj.nextLine();
        if (C.equals("Argentina")){
            System.out.println("Lionel Messi");

        }else if (C.equals("Portugal")){
                System.out.println("Cristiano Ronaldo");
            
            }else{
            System.out.println("no preference");
            }
        scannerObj.close();
    }
}
