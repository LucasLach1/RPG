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
        System.out.println("Floresta fechada");
        //System.out.println(NomePersonagem);

        System.out.println("Você vê na sua frente um castelo nasista");
        System.out.println("O que vc faz? ");
        System.out.printf("1.Fazer um teste de percepção \n");
        System.out.printf("2.Entrar\n");
        System.out.print("Opção: ");
        int opcao = Keys.nextInt();

        if(opcao==1){
            int d20 = rolarD20();
            if(d20 >= 17){
                System.out.println("Você conseguiu");
                System.out.println(d20);
            }else{
                System.out.println("Você não conseguiu");
                System.out.println(d20);
            }

        }

        
    }
    public static String getNomePersonagem() {
            Scanner Keys = new Scanner(System.in);
            System.out.print("Qual nome vc gostaria de dar ao seu personagem: ");
            String nomePersonagem = Keys.next();
            return nomePersonagem;
    }

    public static int rolarD20() {
        return (int)(Math.random() * 20) + 1;
    }
}
