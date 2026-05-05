package RPG;
import java.io.IOException;
import java.util.Scanner;

public class RPG {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner Keys = new Scanner(System.in);
        int vida = 100;
        int dano;
        String Mochila = "Espada, Escudo";
        int IntegridadeDaEspada = 100;
        int IntegridadeDoEscudo = 100;
        
        //Escolha do nome do personagem
        /* 
        System.out.print("Digite o nome do seu personagem: ");
        String nomePersonagem = Keys.next();
        */
        //System.out.println(nomePersonagem);
        
        System.out.println("Escolha o local onde quer começar: ");
        System.out.println("1.Floresta Encantada");
        System.out.println("2.Cidade Metropolitana");
        System.out.println("3.Castelo Abandonado");
        System.out.print("Opção: ");
        int escolha = Keys.nextInt();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        switch (escolha) {
            case 1:
                Floresta florestaEnc = new Floresta();
                Floresta.mostrar();
                break;
        
            case 2:
                Cidade cidade = new Cidade();
                Cidade.mostrar();
                break;
            
            case 3:
                Castelo castelo = new Castelo();
                Castelo.mostrar();
                break;

            default:
                break;
        }
        


    }

    

  
}
