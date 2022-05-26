package br.edu.utfpr.model;

import java.time.LocalDate;

public class LivroLocacao {
    private int codigoLivro;
    private LocalDate dataLocacao;

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LivroLocacao(int codigoLivro, LocalDate dataLocacao) {
        this.codigoLivro = codigoLivro;
        this.dataLocacao = dataLocacao;
    }
}
