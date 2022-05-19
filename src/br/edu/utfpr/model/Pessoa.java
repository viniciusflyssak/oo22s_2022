package br.edu.utfpr.model;

import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private List<Integer> codigoLivrosLocados;

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

    public Pessoa(String nome, int idade, List<Livro> livrosLocados) {
        this.nome = nome;
        this.idade = idade;
    }
}
