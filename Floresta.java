package RPG;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Floresta {
    public static void mostrar() throws InterruptedException, IOException {
        Scanner Keys = new Scanner(System.in);
        int vida = 100;
        int dano;
        //Testes
        int d20 = 0;
        int Sucess = 0;
        int SucessTest = 0;
        //Mochila
        HashMap<String, Integer> inventario = new HashMap<>();
        inventario.put("Espada", 1);
        inventario.put("Escudo", 1);

        
        int IntegridadeDaEspada = 100;
        int IntegridadeDoEscudo = 100;

        System.out.println("Floresta fechada");
        String NomePersonagem = getNomePersonagem();
        apagarTela(1);
        System.out.println("O castelo guarda documentos que podem mudar o rumo da guerra. \nNinguém deveria entrar ali a segurança é rígida e qualquer intruso não sai vivo.\nMesmo assim, alguém precisa tentar. \nAgora, no coração do castelo, tudo depende de um único lance.\n");
        
        //System.out.println(NomePersonagem);
        apagarTela(3);
        System.out.println("Você vê na sua frente um castelo abandonado");
        System.out.println("O que vc faz? ");
        System.out.printf("1.Fazer um teste de percepção \n");
        System.out.printf("2.Entrar\n");
        System.out.print("Opção: ");
        int opcao = Keys.nextInt();

        if(opcao==1){
            d20 = rolarD20();
            if(d20 >= 9){
                System.out.println("Você conseguiu");
                SucessTest++;
            }else{
                System.out.println("Você não conseguiu");
                System.out.println(d20);
                apagarTela(1);
                opcao = 0;
            }
        }

        if(opcao == 2){
            d20 = rolarD20();
            if(d20 < 17){
                apagarTela(1);

                System.out.println("Você foi avistado!");
                System.out.println("E morto");
                opcao = 0;
                apagarTela(2);
            }else{
                System.out.println("Você conseguiu entrar sorrateiramente");
                Sucess++;
            }
        }

        //Se os testes forem verdadeiros executa este bloco
       
        if(SucessTest == 1){
            apagarTela(1);
            System.out.println("Você entra?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            System.out.print("Opcão: ");
            opcao = Keys.nextInt();
            Sucess = 1;
        }

        if(Sucess == 1){
            apagarTela(1);
            System.out.println("Ao entrar você se depara em um corredor com bandeiras com uma suastica nazista e no final dele, contém 3 portas, qual você entra?");
            System.out.println("1.Entrar na primeira da esquerda");
            System.out.println("2.Entrar na do meio");
            System.out.println("3.Entrar na da direita");
            System.out.print("Opção: ");
            opcao = Keys.nextInt();
        }
        if(opcao == 1){
            d20 = rolarD20();
        }
        
        if(opcao == 1 && d20 >= 10){
            System.out.println("Você entra na porta da esquerda e acha uma arma no chão");
            System.out.println("E a pega");
            inventario.put("Arma 9mm", 1);
            inventario.put("Munição 9mm", 30);
        }else if(opcao == 1 && d20<10){
            System.out.println("Você achou 2 soldados bem na frente da porta e eles atiraram em você e te mataram");
        }
        if(opcao == 2){
            apagarTela(2);
            System.out.println("Você conseguiu entrar e achou uma escopeta você pega?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            System.out.print("Opção: ");
            opcao = Keys.nextInt();
            if(opcao == 1){
                inventario.put("Escopeta", 1);
                inventario.put("Munição 12mm", 30);
                System.out.printf("%s conseguiu %s escopeta, com %d balas ", NomePersonagem,inventario.get("Escopeta"), inventario.get("Munição 12mm"));
                
            }else{
                System.out.println("Você deixa a arma no chão");
            }
        }
        if(opcao == 3 && d20 >= 20 ){
            System.out.println("Tudo aponta para o fracasso. O risco é total.\n" +  "Mas, no instante exato, cada movimento encaixa perfeitamente.\n" +  "O impossível acontece.\n" +  "20 no dado.");
        }else{
            
        }

        if(inventario.get("Escopeta") == 1 && inventario.get("Munição 12mm") >=1){
            System.out.println("Aparece 3 capangas e você tem que mata-los antes que eles te vejam");
            System.out.println("Atirar para todo o lado?");
            System.out.println("1.Sim");
            System.out.println("2.Não");
            System.out.print("Opção: ");
            opcao = Keys.nextInt();
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

    public static void apagarTela(int tempo) throws InterruptedException, IOException{
        TimeUnit.SECONDS.sleep(tempo);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
