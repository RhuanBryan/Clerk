package clerk;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author r.gomes and hsousa
 */
public class GameManeger {

    public GameManeger() {

    }

    public void ProximaEtapa() {
        Scanner ler = new Scanner(System.in);

        String resposta;
        String opcao;

        opcao = ler.nextLine();

        while (!"".equals(opcao)) {
            System.out.println("(•﹏•) Hmm... não entendi...");
            opcao = ler.nextLine();
        }
    }

    public void IniciarJogo() {
        System.out.println("-----------------------------");
        System.out.println(" Clerk ");
        System.out.println("-----------------------------");
        System.out.println("\n");
        System.out.println("Jogar");
        System.out.println("\n");
        System.out.println("Aperte a tecla ->ENTER<- para continuar");
        System.out.println("\n");
    }

    public void IntroducaoJogo() {

        System.out.println("(•‿•) Olá campeão, vamos embarcar em uma aventura onde você irá derrotar monstros,");
        System.out.println("conseguir itens e por fim derrotar o... Amanuensis!\n");
        System.out.println("(•‿•) Essa missão será difícil, e isso é tudo que você precisa saber...");
        System.out.println("(•‿•) Está pronto?\n");
        System.out.println("Aperte a tecla ->ENTER<- para continuar");
    }

    public void Batalha1(Player player) {
    Scanner ler = new Scanner(System.in);
    ArrayList<Inimigo> inimigos = new ArrayList();

    Inimigo aranha = new Inimigo("Aranha", 120, 20);
    Inimigo esqueleto = new Inimigo("Esqueleto", 160, 20);

    inimigos.add(aranha);
    inimigos.add(esqueleto);

    java.util.Random random = new java.util.Random();

    int numero = random.nextInt(2);
    Inimigo inimigo = inimigos.get(numero);

    switch (numero) {
        case 0:
            System.out.println("ShhShhShhShh");
            System.out.println("\n(ﾉﾟ0ﾟ)ﾉ Isso é uma aranha!");
            break;
        case 1:
            System.out.println("CrekCrekCrek");
            System.out.println("\n(ﾉﾟ0ﾟ)ﾉ Isso é um esqueleto!");
            break;
    }
    
    switch (numero) {
        case 0:
            aranha.Nascer();

            while (aranha.isEstado() && player.getVida() > 0) {
                System.out.println("\nDigite o que quer fazer: ");
                System.out.println("1) Atacar");
                System.out.println("2) Defender\n");
                int escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        aranha.Vida(40, numero);
                        aranha.atacar(player);
                        if (aranha.getVida() <= 0) {
                            numero = aranha.Morrer(numero);
                        }
                        break;
                    case 2:
                        aranha.Vida(20, numero);
                        aranha.atacar(player);
                        break;
                    default:
                        System.out.println("(´;︵;`) Você perdeu a vez!");
                }
                if (player.getVida() <= 0) {
                    System.out.println("Você morreu! A batalha acabou.");
                    return; // Encerra a batalha
                }
            }
            break;

        case 1:
            esqueleto.Nascer();

            while (esqueleto.isEstado() && player.getVida() > 0) {
                System.out.println("\nDigite o que quer fazer: ");
                System.out.println("1) Atacar");
                System.out.println("2) Defender\n");
                int escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        esqueleto.Vida(40, numero);
                        esqueleto.atacar(player);
                        System.out.println(numero);
                        if (esqueleto.getVida() <= 0) {
                            numero = esqueleto.Morrer(numero);
                        }
                        break;
                    case 2:
                        esqueleto.Vida(20, numero);
                        esqueleto.atacar(player);
                        break;
                    default:
                        System.out.println("(´;︵;`) Você perdeu a vez!");
                }
                if (player.getVida() <= 0) {
                    System.out.println("Você morreu! A batalha acabou.");
                    return; // Encerra a batalha
                }
            }
            break;
    }
}
    
    public void Batalha2(Player player) {
    Scanner ler = new Scanner(System.in);
    ArrayList<Inimigo> inimigos = new ArrayList();

    Inimigo zumbi = new Inimigo("Zumbi", 120, 20);
    Inimigo afogado = new Inimigo("Afogado", 160, 20);

    inimigos.add(zumbi);
    inimigos.add(afogado);

    java.util.Random random = new java.util.Random();

    int numero = random.nextInt(2);
    Inimigo inimigo = inimigos.get(numero);

    switch (numero) {
        case 0:
            System.out.println("Raaahn Raaahn");
            System.out.println("\n(ﾉﾟ0ﾟ)ﾉ Isso é um zumbi!");
            break;
        case 1:
            System.out.println("Reeehn Reeehn");
            System.out.println("\n(ﾉﾟ0ﾟ)ﾉ Isso é um afogado!");
            break;
    }
    
    switch (numero) {
        case 0:
            zumbi.Nascer();

            while (zumbi.isEstado() && player.getVida() > 0) {
                System.out.println("\nDigite o que quer fazer: ");
                System.out.println("1) Atacar");
                System.out.println("2) Defender\n");
                int escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        zumbi.Vida(40, numero);
                        zumbi.atacar(player);
                        if (zumbi.getVida() <= 0) {
                            numero = zumbi.Morrer(numero);
                        }
                        break;
                    case 2:
                        zumbi.Vida(20, numero);
                        zumbi.atacar(player);
                        break;
                    default:
                        System.out.println("(´;︵;`) Você perdeu a vez!");
                }
                if (player.getVida() <= 0) {
                    System.out.println("Você morreu! A batalha acabou.");
                    return; // Encerra a batalha
                }
            }
            break;

        case 1:
            afogado.Nascer();

            while (afogado.isEstado() && player.getVida() > 0) {
                System.out.println("\nDigite o que quer fazer: ");
                System.out.println("1) Atacar");
                System.out.println("2) Defender\n");
                int escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        afogado.Vida(40, numero);
                        afogado.atacar(player);
                        System.out.println(numero);
                        if (afogado.getVida() <= 0) {
                            numero = afogado.Morrer(numero);
                        }
                        break;
                    case 2:
                        afogado.Vida(20, numero);
                        afogado.atacar(player);
                        break;
                    default:
                        System.out.println("(´;︵;`) Você perdeu a vez!");
                }
                if (player.getVida() <= 0) {
                    System.out.println("Você morreu! A batalha acabou.");
                    return; // Encerra a batalha
                }
            }
            break;
    }
}

    public void Batalha3(Player player) {
    Scanner ler = new Scanner(System.in);
    ArrayList<Inimigo> inimigos = new ArrayList();

    Inimigo traça = new Inimigo("Traça", 120, 20);
    Inimigo endermite = new Inimigo("Endermite", 160, 20);

    inimigos.add(traça);
    inimigos.add(endermite);

    java.util.Random random = new java.util.Random();

    int numero = random.nextInt(2);
    Inimigo inimigo = inimigos.get(numero);

    switch (numero) {
        case 0:
            System.out.println("Raaahn Raaahn");
            System.out.println("\n(ﾉﾟ0ﾟ)ﾉ Isso é um traça!");
            break;
        case 1:
            System.out.println("Reeehn Reeehn");
            System.out.println("\n(ﾉﾟ0ﾟ)ﾉ Isso é um endermite!");
            break;
    }
    
    switch (numero) {
        case 0:
            traça.Nascer();

            while (traça.isEstado() && player.getVida() > 0) {
                System.out.println("\nDigite o que quer fazer: ");
                System.out.println("1) Atacar");
                System.out.println("2) Defender\n");
                int escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        traça.Vida(40, numero);
                        traça.atacar(player);
                        if (traça.getVida() <= 0) {
                            numero = traça.Morrer(numero);
                        }
                        break;
                    case 2:
                        traça.Vida(20, numero);
                        traça.atacar(player);
                        break;
                    default:
                        System.out.println("(´;︵;`) Você perdeu a vez!");
                }
                if (player.getVida() <= 0) {
                    System.out.println("Você morreu! A batalha acabou.");
                    return; // Encerra a batalha
                }
            }
            break;

        case 1:
            endermite.Nascer();

            while (endermite.isEstado() && player.getVida() > 0) {
                System.out.println("\nDigite o que quer fazer: ");
                System.out.println("1) Atacar");
                System.out.println("2) Defender\n");
                int escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        endermite.Vida(40, numero);
                        endermite.atacar(player);
                        System.out.println(numero);
                        if (endermite.getVida() <= 0) {
                            numero = endermite.Morrer(numero);
                        }
                        break;
                    case 2:
                        endermite.Vida(20, numero);
                        endermite.atacar(player);
                        break;
                    default:
                        System.out.println("(´;︵;`) Você perdeu a vez!");
                }
                if (player.getVida() <= 0) {
                    System.out.println("Você morreu! A batalha acabou.");
                    return; // Encerra a batalha
                }
            }
            break;
    }
}

    public void Batalha4(Player player) {
    Scanner ler = new Scanner(System.in);
    ArrayList<Inimigo> inimigos = new ArrayList();

    Inimigo creeper = new Inimigo("Creeper", 120, player.getVida() / 2);
    Inimigo slime = new Inimigo("Slime", 160, 20);

    inimigos.add(creeper);
    inimigos.add(slime);

    java.util.Random random = new java.util.Random();

    int numero = random.nextInt(2);
    Inimigo inimigo = inimigos.get(numero);

    switch (numero) {
        case 0:
            System.out.println("Raaahn Raaahn");
            System.out.println("\n(ﾉﾟ0ﾟ)ﾉ Isso é um creeper!");
            break;
        case 1:
            System.out.println("Reeehn Reeehn");
            System.out.println("\n(ﾉﾟ0ﾟ)ﾉ Isso é um slime!");
            break;
    }
    
    switch (numero) {
        case 0:
            creeper.Nascer();

            while (creeper.isEstado() && player.getVida() > 0) {
                System.out.println("\nDigite o que quer fazer: ");
                System.out.println("1) Atacar");
                System.out.println("2) Defender\n");
                int escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        creeper.Vida(40, numero);
                        creeper.atacar(player);
                        if (creeper.getVida() <= 0) {
                            numero = creeper.Morrer(numero);
                        }
                        break;
                    case 2:
                        creeper.Vida(20, numero);
                        creeper.atacar(player);
                        break;
                    default:
                        System.out.println("(´;︵;`) Você perdeu a vez!");
                }
                if (player.getVida() <= 0) {
                    System.out.println("Você morreu! A batalha acabou.");
                    return; // Encerra a batalha
                }
            }
            break;

        case 1:
            slime.Nascer();

            while (slime.isEstado() && player.getVida() > 0) {
                System.out.println("\nDigite o que quer fazer: ");
                System.out.println("1) Atacar");
                System.out.println("2) Defender\n");
                int escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        slime.Vida(40, numero);
                        slime.atacar(player);
                        System.out.println(numero);
                        if (slime.getVida() <= 0) {
                            numero = slime.Morrer(numero);
                        }
                        break;
                    case 2:
                        slime.Vida(20, numero);
                        slime.atacar(player);
                        break;
                    default:
                        System.out.println("(´;︵;`) Você perdeu a vez!");
                }
                if (player.getVida() <= 0) {
                    System.out.println("Você morreu! A batalha acabou.");
                    return; // Encerra a batalha
                }
            }
            break;
    }
}

    public void BatalhaBoss(Player player) {
    Scanner ler = new Scanner(System.in);

    Amanuensis boss = new Amanuensis("Amanuensis", 400, 80);

    boss.Nascer();

    int numero = 0; // Inicialize a variável numero

    while (boss.isEstado() && player.getVida() > 0) {
        System.out.println("\nDigite o que quer fazer: ");
        System.out.println("1) Atacar");
        System.out.println("2) Defender\n");
        int escolha = ler.nextInt();
        switch (escolha) {
            case 1:
                boss.Vida(40, numero);
                boss.atacar(player);
                System.out.println();
                if (boss.getVida() <= 0) {
                    numero = boss.Morrer(numero);
                }
                break;
            case 2:
                boss.Vida(20, numero);
                boss.atacar(player);
                break;
            default:
                System.out.println("(´;︵;`) Você perdeu a vez!");
        }
        if (player.getVida() <= 0) {
            System.out.println("Você morreu! A batalha acabou.");
            return; // Encerra a batalha
        }
    }
}

    public void receberKitMedic() {
        System.out.println("\nUAU, você derrotou seu primeiro mob!");
        System.out.println("Gostei da sua bravura, irei te presentear com uma coisa que vai te ajudar muito.\n");
         /*player.ReceberMedicamento();*/
                /*System.out.println("\nVocê recebeu um kit médico, use com sabedoria!\n");*/
    }

    public void ataqueInimigo() {
        
    }
}