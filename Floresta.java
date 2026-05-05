package RPG;

import java.util.Scanner;

public class Floresta {
    public static void mostrar() {
        Scanner Keys = new Scanner(System.in);
        int vida = 100;
        int dano;
        String Mochila = "Espada, Escudo";
        int IntegridadeDaEspada = 100;
        int IntegridadeDoEscudo = 100;

        
        String NomePersonagem = getNomePersonagem();
        System.out.println("Floresta encantada :)");
        System.out.println();
    }
    public static String getNomePersonagem() {
            Scanner Keys = new Scanner(System.in);
            System.out.print("Qual nome vc gostaria de dar ao seu personagem: ");
            String nomePersonagem = Keys.next();
            return nomePersonagem;
    }
}
