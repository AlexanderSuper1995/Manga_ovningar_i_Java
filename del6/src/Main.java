
//Skapa ett program som beräknar funktionen ax3 + 7 och skriver ut resultatet. Variablerna
//a och x ska läsas in.

public class Main {
    static int beraknar() {
       int summan =0;
       int x = 3;
        summan = x/3+7/3;
        System.out.println(summan);
        return summan;
    }
    public static void main(String[] args) {
        beraknar();

    }
}