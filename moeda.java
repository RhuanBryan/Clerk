package clerk;

/**
 *
 * @author r.gomes
 */
public class moeda {
    private String nome;
    private int moedaAdicional;

    public moeda(String nome, int moedaAdicional) {
        this.nome = nome;
        this.moedaAdicional = moedaAdicional;
    }

    public int getMoedaAdicional() {
        return moedaAdicional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}