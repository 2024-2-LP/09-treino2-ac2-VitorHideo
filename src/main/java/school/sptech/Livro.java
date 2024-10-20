package school.sptech;

import school.sptech.exception.ArgumentoInvalidoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private List<Avaliacao> avaliacoes;

    public Livro(String titulo, String autor, LocalDate dataPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.avaliacoes = new ArrayList<>();
    }

    public Livro() {
    }

    public void adicionarAvaliacao(String descricao, Double qtdEstrelas) {

        if (descricao == null || descricao.isBlank()) {
            throw new ArgumentoInvalidoException("Argumento invalido");
        } else if (qtdEstrelas < 0 || qtdEstrelas > 5) {
            throw new ArgumentoInvalidoException("Argumento invalido");
        }

        avaliacoes.add(new Avaliacao(descricao,qtdEstrelas));
    }

    public Double calcularMediaAvaliacoes() {

        if (avaliacoes.isEmpty()) {
            return 0.0;
        }

        Double resultado = 0.0;
        for (Avaliacao avaliacao: avaliacoes) {
            resultado += avaliacao.getQtdEstrelas();
        }
        return resultado / avaliacoes.size();
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
