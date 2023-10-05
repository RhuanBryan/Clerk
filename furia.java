package clerk;

/**
 *
 * @author r.gomes
 */
public class furia {
    private String nome;
    private int furiaAdicional;

    public furia(String nome, int furiaAdicional) {
        this.nome = nome;
        this.furiaAdicional = furiaAdicional;
    }

    public int getFuriaAdicional() {
        return furiaAdicional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}