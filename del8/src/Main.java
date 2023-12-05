//Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
//Rektangelns sidor ska läsas in
public class Main {
    public static void main(String[] args) {

    //Rektangelns sidor
    int top=10;
    int left = 4;
    int rigt =6;
    int botten = 10;



        // räkna om omkretsen
        System.out.println( "omkretsen är ");

        System.out.println( top+left+rigt+botten);


        // arean
        System.out.println( "arean är ");

        System.out.println(botten*top/2);
    }
}