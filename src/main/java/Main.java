import java.util.Scanner;

/**
 * Created by blinstall on 2/22/2017.
 */

public class Main  {
    public static void main(String[] args) {

        System.out.println("Hello Bello !");
        Calculator calc=new Calculator();
        Scanner citeste = new Scanner(System.in);
        //System.out.println("introdu numarDinConsola1");
        //System.out.println(" introdu altuDinConsola");
        System.out.println("introdu numarDinConsola1");
       int numarDinConsola =  citeste.nextInt();
        System.out.println(" introdu altuDinConsola");
        int altuDinConsola= citeste.nextInt();
        int suma =calc.adunare(numarDinConsola,altuDinConsola);
        System.out.println("rezu: " + suma);
        int inmultire=calc.inmultire(numarDinConsola,altuDinConsola);
        System.out.println("rezu*: " + inmultire);

        System.out.printf("acesta e numarul din consola: " + numarDinConsola);
       calc.adunare(numarDinConsola,altuDinConsola);
       calc.inmultire(altuDinConsola,numarDinConsola);
    }


}
