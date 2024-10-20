package school.sptech;

import school.sptech.exception.ArgumentoInvalidoException;
import school.sptech.exception.LivroNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {


    private String nome;
    private List<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public Biblioteca() {

    }

    public void adicionarLivro(Livro livro) {
        if (livro == null || livro.getTitulo() == null || livro.getTitulo().isBlank()) {
            throw new ArgumentoInvalidoException("Argumento invalido");
        } else if (livro.getAutor() == null || livro.getAutor().isBlank() || livro.getDataPublicacao() == null) {
            throw new ArgumentoInvalidoException("Argumento invalido");
        } else {
            livros.add(livro);
        }
    }

    public void removerLivroPorTitulo(String titulo) {
        Livro livroRemovido = buscarLivroPorTitulo(titulo);
        livros.remove(livroRemovido);
    }

    public Livro buscarLivroPorTitulo(String titulo) {

        if (titulo == null || titulo.isBlank()) {
            throw new ArgumentoInvalidoException();
        }
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        throw new LivroNaoEncontradoException("Livro não encontrado");
    }

    public Integer contarLivros() {
        return livros.size();
    }

    public List<Livro> obterLivrosAteAno(Integer ano) {
        List<Livro> listaResultados = new ArrayList<>();

        for (Livro livro: livros) {
            if (livro.getDataPublicacao().getYear() <= ano) {
                listaResultados.add(livro);
            }
        }
        return listaResultados;
    }

    public List<Livro> retornarTopCincoLivros() {

        List<Livro> listaResultado = new ArrayList<>();

        for (Livro livro : livros) {
            listaResultado.add(livro);

        }
        return listaResultado;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
