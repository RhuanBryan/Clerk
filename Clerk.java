package clerk;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author r.gomes and h.sousa
 */
public class Clerk {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        /*System.out.println("");*/
        String resposta;
        String opcao;

        GameManeger clerk = new GameManeger();
        Player player = new Player("Clerk", 240, 40, 0, 40);
        kitMedico itemVidaExtra = new kitMedico("Vida Extra", 250);
        moeda itemMoedaAdicional = new moeda("Moeda", 30);
        /*furia itemFuriaAdicional = new furia("Furia", 30);*/

        clerk.IniciarJogo();

        clerk.ProximaEtapa();

        clerk.IntroducaoJogo();
        
        clerk.ProximaEtapa();
        
        System.out.println("\n(◔‿◔) Certo. Você irá batalhar com alguns monstros capangas do Amanuensis no caminho. Tome cuidado, pois alguns deles podem ser traiçoeiros.");

        
        
        
        clerk.Batalha1(player);

        clerk.receberKitMedic();
        System.out.println("Vida do jogador antes de usar o item: " + player.getVida());

        player.usarItem(itemVidaExtra);

        System.out.println("Vida do jogador após usar o item: " + player.getVida());
        
        System.out.println("\n");
        
        System.out.println("Carteira do jogador antes da batalha: R$" + player.getCarteira() + ",00");

        player.ganharItem(itemMoedaAdicional);

        System.out.println("Carteira do jogador depois da batalha: R$" + player.getCarteira() + ",00");
        
        /*System.out.println("\n");
        
        System.out.println("Força do jogador antes da batalha: " + player.getMusculo());
        
        player.receberItem(itemFuriaAdicional);
        
        System.out.println("Força do jogador depois da batalha: " + player.getMusculo());*/
        
        System.out.println("---------------------------------------------------------");
        
        
        
        clerk.Batalha2(player);
        System.out.println("Vida do jogador antes de usar o item: " + player.getVida());

        player.usarItem(itemVidaExtra);

        System.out.println("Vida do jogador após usar o item: " + player.getVida());
        
        System.out.println("\n");
        
        System.out.println("Carteira do jogador antes da batalha: R$" + player.getCarteira() + ",00");

        player.ganharItem(itemMoedaAdicional);

        System.out.println("Carteira do jogador depois da batalha: R$" + player.getCarteira() + ",00");
        
        /*System.out.println("\n");
        
        System.out.println("Força do jogador antes da batalha: " + player.getMusculo());
        
        player.receberItem(itemFuriaAdicional);
        
        System.out.println("Força do jogador depois da batalha: " + player.getMusculo());*/
        
        System.out.println("---------------------------------------------------------");
        
        
        
        clerk.Batalha3(player);
        System.out.println("Vida do jogador antes de usar o item: " + player.getVida());

        player.usarItem(itemVidaExtra);

        System.out.println("Vida do jogador após usar o item: " + player.getVida());
        
        System.out.println("\n");
        
        System.out.println("Carteira do jogador antes da batalha: R$" + player.getCarteira() + ",00");

        player.ganharItem(itemMoedaAdicional);

        System.out.println("Carteira do jogador depois da batalha: R$" + player.getCarteira() + ",00");
        
        /*System.out.println("\n");
        
        System.out.println("Força do jogador antes da batalha: " + player.getMusculo());
        
        player.receberItem(itemFuriaAdicional);
        
        System.out.println("Força do jogador depois da batalha: " + player.getMusculo());*/
        
        System.out.println("---------------------------------------------------------");
        
        
        
        clerk.Batalha4(player);
        System.out.println("Vida do jogador antes de usar o item: " + player.getVida());

        player.usarItem(itemVidaExtra);

        System.out.println("Vida do jogador após usar o item: " + player.getVida());
        
        System.out.println("\n");
        
        System.out.println("Carteira do jogador antes da batalha: R$" + player.getCarteira() + ",00");

        player.ganharItem(itemMoedaAdicional);

        System.out.println("Carteira do jogador depois da batalha: R$" + player.getCarteira() + ",00");
        
        /*System.out.println("\n");
        
        System.out.println("Força do jogador antes da batalha: " + player.getMusculo());
        
        player.receberItem(itemFuriaAdicional);
        
        System.out.println("Força do jogador depois da batalha: " + player.getMusculo());*/
        
        System.out.println("---------------------------------------------------------");
        
        clerk.BatalhaBoss(player);
        
        System.out.println("---------------------------------------------------------");
        System.out.println("\n");
        System.out.println("O jogo chegou ao fim!!");
        System.out.println("\n\n");
    }
}