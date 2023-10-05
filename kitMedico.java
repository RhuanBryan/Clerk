package clerk;

/**
 *
 * @author r.gomes
 */
public class kitMedico {

    private String nome;
    private int vidaAdicional;

    public kitMedico(String nome, int vidaAdicional) {
        this.nome = nome;
        this.vidaAdicional = vidaAdicional;
    }

    public int getVidaAdicional() {
        return vidaAdicional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
