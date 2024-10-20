package school.sptech;

public class Avaliacao {

    private String descricao;
    private Double qtdEstrelas;


    public Avaliacao(String descricao, Double qtdEstrelas) {
        this.descricao = descricao;
        this.qtdEstrelas = qtdEstrelas;
    }

    public Avaliacao () {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getQtdEstrelas() {
        return qtdEstrelas;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtdEstrelas(Double qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }
}
