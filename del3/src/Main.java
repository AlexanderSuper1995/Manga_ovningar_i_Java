import java.util.Scanner;

//Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
//blir omvandlat till minuter resp sekunder.
public class Main {

    public static void main(String[] args) {
        int timmar =0;
        int minuter =0;
        int sekunder =0;
        Scanner ScannerObj = new Scanner(System.in);
        System.out.println("skiv hur många timmer  in antal timmar");

        ScannerObj.nextInt();
        System.out.println("timmar: " + timmar);

        double summan = timmar + (minuter * sekunder);
        }
    }
