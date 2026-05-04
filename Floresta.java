package RPG;

import java.util.Scanner;

public class Floresta {
    public static void mostrar() {
        Scanner Keys = new Scanner(System.in);
        RPG nomePer = new RPG();
        int vida = 100;
        int dano;
        String Mochila = "Espada, Escudo";
        int IntegridadeDaEspada = 100;
        int IntegridadeDoEscudo = 100;

        nomePer.main(String[] args);
        System.out.println("Floresta encantada :)");
    }
}
