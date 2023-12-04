import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  /* En försäljare har delvis prestationslön.
         Han får 8000 kr per månad i grundlön och 9% av
          försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
           Försäljningssumman ska läsas in. */
// Skapa en Scanner för att läsa in försäljningssumman från användaren
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange försäljningssumman: ");
        double forsäljningssumma = scanner.nextDouble();
        scanner.close();
        double grundlon = 8000.0;
        double procentAvFörsaljning = 0.09;

        // Beräkna lönen
        double Lön = grundlon + (forsäljningssumma * procentAvFörsaljning);
        System.out.print(Lön);
        }
    }
