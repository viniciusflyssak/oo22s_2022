package br.edu.utfpr.model;

import java.util.List;

public class Pessoa {
    private  int codigoPessoa;

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(int codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public List<LivroLocacao> getCodigoLivrosLocados() {
        return codigoLivrosLocados;
    }

    public void setCodigoLivrosLocados(List<LivroLocacao> codigoLivrosLocados) {
        this.codigoLivrosLocados = codigoLivrosLocados;
    }

    private String nome;
    private int idade;
    private List<LivroLocacao> codigoLivrosLocados;

    public void addCodigoLivrosLocados(LivroLocacao livroLocar) {
        this.codigoLivrosLocados.add(livroLocar);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(int codigoPessoa, String nome, int idade, List<LivroLocacao> codigoLivrosLocados) {
        this.codigoPessoa = codigoPessoa;
        this.nome = nome;
        this.idade = idade;
        this.codigoLivrosLocados = codigoLivrosLocados;
    }
}
