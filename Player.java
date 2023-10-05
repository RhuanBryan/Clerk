package clerk;

public class Player {
    private String nome;
    private int vida;
    private int forca;
    private int carteira;
    private int musculo;

    public Player(String nome, int vida, int forca, int carteira, int musculo) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.carteira = carteira;
        this.musculo = musculo;
    }

    public void Vida(int danoSofrido, int numero) {
        this.setVida(this.getVida() - danoSofrido);
        System.out.println(this.getVida());
        if (getVida() <= 0) {
            /*System.out.println("\nO(a) " + this.getNome() + " morreu!\n");*/
        }
    }

    public void ReceberMedicamento() {
        System.out.println("Recebeu Medicamento!");
    }
    
    public void usarItem(kitMedico kitMedico) {
        int vidaAdicional = kitMedico.getVidaAdicional();
        this.vida += vidaAdicional;
        System.out.println("Você usou o item " + kitMedico.getNome() + " e ganhou " + vidaAdicional + " de vida!");
}
    
    public void ganharItem(moeda moedaAdicional) {
        int moeda = moedaAdicional.getMoedaAdicional();
        this.carteira += moeda;
        System.out.println("Você ganhou R$" + moeda + ",00 de moedas!");
}
    
    /*public void receberItem(furia furiaAdicional){
        int furia = furiaAdicional.getFuriaAdicional();
        this.musculo += furia;
        System.out.println("Você ganhou " + furia + " de força!");
    }*/
    
    public void receberdano(int dano) {
        if (dano > 0) {
            this.setVida(this.getVida() - dano);
            System.out.println("Você causou " + getForca() + " de dano no inimigo");
            System.out.println("Você está com " + getVida() + " de vida");
            if (getVida() <= 0) {
                System.out.println("\nO(a) " + this.getNome() + " morreu!\n");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public String toString() {
        return "Player [Nome = " + nome + ", força = " + forca + "] ";
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCarteira() {
        return carteira;
    }

    public void setCarteira(int carteira) {
        this.carteira = carteira;
    }
    
     public int getMusculo() {
        return musculo;
    }

    public void setMusculo(int musculo) {
        this.musculo = musculo;
    }
}