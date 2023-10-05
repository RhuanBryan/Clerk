package clerk;

import java.util.Random;

public class Inimigo {

    private String nome;
    private int vida;
    private int forca;
    private boolean estado;

    public Inimigo() {
    }

    public Inimigo(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.estado = true;
    }

    public void Vida(int danoSofrido, int numero) {
        this.setVida(this.getVida() - danoSofrido);
        if (getVida() <= 0) {
            System.out.println("\nO(a) " + this.getNome() + " morreu!\n");
            Morrer(numero);
        }
        System.out.println(getNome() + " está com: " + getVida() + " de vida");
    }

    public void Nascer() {
         System.out.println(getNome() + " possui: " + getVida() + " de vida");
    }

    public int Morrer(int numero) {
        this.setForca(0);
        this.setEstado(false);
        return numero + 1;
    }

    public void atacar(Player player) {
        if (this.isEstado()) {
            int dano = this.getForca();
            player.receberdano(dano);
            System.out.println("O(a) " + this.getNome() + " atacou o jogador e causou " + dano + " de dano!");
        }
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }
}