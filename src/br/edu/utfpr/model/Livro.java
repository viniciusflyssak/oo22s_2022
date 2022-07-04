package br.edu.utfpr.model;

import java.util.Date;

public class Livro extends Identificador { //herança
    private int ano;
    private String nomeAutor;
    private int qtdeDisponivel;
    private int qtdeReservada;

    public int getCodigoLivro() {
        return getCodigo();
    }

    public void setCodigoLivro(int codigoLivro) {
        this.setCodigo(codigoLivro);
    }

    public String getNome() {
        return getNome();
    }

    public void setNome(String nome) {
        this.setNome(nome);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public Livro(int codigoLivro, String nome, int ano, String nomeAutor, int qtdeDisponivel) {
        super(codigoLivro, nome);
        this.ano = ano;
        this.nomeAutor = nomeAutor;
        this.qtdeDisponivel = qtdeDisponivel;
    }
}
