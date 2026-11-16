package Unit_02.Chapter_02.Q_02_02_04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        String P1 = scannerObj.nextLine();
        int y = 0;
        if (P1.length() == 4){
            System.out.println("New PIN stored.");
            y = 1;
        }else{
            System.out.println("Invalid PIN length entered. Goodbye.");
        }
        if (y == 1){
            String P2 = scannerObj.nextLine();
            if (P2.length() == 4){
            if (P2.equals(P1)){
                int M = Integer.parseInt(scannerObj.nextLine());
                if (M > 500){
                    System.out.println("Insufficient funds. Goodbye.");
                }else if (M > 250){
                    System.out.println("Exceeds daily limit. Goodbye.");

                }else{
                    System.out.println("Withdrawal approved.");
                    System.out.println("Balance: $" + (500 - M));
                }

            }else{
                System.out.println("Invalid PIN entered. Goodbye.");
            }
        }else{
            System.out.println("Invalid PIN length entered. Goodbye.");
        }
    }
    
        scannerObj.close();
    }
}