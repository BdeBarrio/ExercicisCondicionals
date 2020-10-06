import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        long temps, tempsInicial, tempsFinal;
        float tempsensegons;
        String paraula;
        Scanner objeto= new Scanner(System.in);

        tempsInicial = System.currentTimeMillis();
        System.out.println("Escriu la paraula 'Covid-19': ");
        paraula = objeto.nextLine();
        if(paraula.equalsIgnoreCase( "Covid-19")){
            tempsFinal = System.currentTimeMillis();
            temps = tempsFinal - tempsInicial;
            tempsensegons = (float)temps/1000;
            System.out.println("Has trigat: "+tempsensegons+" segons");
            if(tempsensegons<2){
                System.out.println("Ets un crack!!");
            }else if(tempsensegons<=3){
                System.out.println("Força ràpid");
            }else{
                System.out.println("Lentorrooa");
            }
        }
    }
}
