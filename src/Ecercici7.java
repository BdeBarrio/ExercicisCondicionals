import java.util.Scanner;

public class Ecercici7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] llista = new float[3];
        float max, min;

        for(int i = 0;i<llista.length;i++){
            System.out.println("Introdueix un número: ");
            llista[i] = sc.nextFloat();
        }
        min=llista[0];
        max=llista[0];

        for(int i=1;i<llista.length;i++){
            if(min<llista[i]){

            }else{
                min = llista[i];
            }

            if(!(max>llista[i])){
                max = llista[1];
            }

        }



    }
}
