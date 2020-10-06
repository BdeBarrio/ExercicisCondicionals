import javax.swing.*;
import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {

        String objeto;
        String etiqueta;
        int anymatricula;
        Scanner autonomia = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        objeto = JOptionPane.showInputDialog(null, "Indica el tipus de vehicle que tens indicant el numero:\n\n" +
                "1. Elèctric\n" +
                "2. Hibrid\n" +
                "3. Gasolina\n" +
                "4. Diesel");

        switch (objeto) {
            case "1":
                System.out.println("El teu cotxe tpe una autonomia superior a 40 km? (S/N)");
                if (autonomia.next().equalsIgnoreCase("S")) {
                    etiqueta = "0 emissions";
                } else {
                    etiqueta = "ECO";
                }

                break;

            case "2":
                etiqueta = "ECO";

                break;

            case "3":
                System.out.println("INtrodueix l'any de matriculació:");
                anymatricula = sc.nextInt();
                break;

            case "4":
                System.out.println("INtrodueix l'any de matriculació:");
                anymatricula = sc.nextInt();
                if (anymatricula < 2006) {
                    etiqueta = "Sense etiqueta";
                } else if (anymatricula < 2015) {


                    break;


                }
                System.out.println("El teu vehicle tè etiqueta: ");


        }
    }
}
