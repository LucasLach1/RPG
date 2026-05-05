package RPG;

import java.util.Scanner;

public class Cidade {
    public static void mostrar(){
        System.out.println("Cidade metropolitana :)");
        String NomePersonagem = getNomePersonagem();
    }
    public static String getNomePersonagem() {
            Scanner Keys = new Scanner(System.in);
            System.out.print("Qual nome vc gostaria de dar ao seu personagem: ");
            String nomePersonagem = Keys.next();
            return nomePersonagem;
    }
}
