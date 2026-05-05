package RPG;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cidade {
    public static void mostrar() throws InterruptedException, IOException{
        System.out.println("Cidade metropolitana :)");
        System.out.println("Ainda em desenvolvimento :)");
        TimeUnit.SECONDS.sleep(1);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Floresta florestaEnc = new Floresta();
        Floresta.mostrar();
        //String NomePersonagem = getNomePersonagem();
    }
    public static String getNomePersonagem() {
            Scanner Keys = new Scanner(System.in);
            System.out.print("Qual nome vc gostaria de dar ao seu personagem: ");
            String nomePersonagem = Keys.next();
            return nomePersonagem;
    }
}
