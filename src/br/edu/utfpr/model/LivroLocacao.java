package br.edu.utfpr.model;

import java.time.LocalDate;

public class LivroLocacao extends Identificador{ //herança
    private LocalDate dataLocacao;

    public int getCodigoLivro() {
        return getCodigo();
    }

    public void setCodigoLivro(int codigoLivro) {
        this.setCodigo(codigoLivro);
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LivroLocacao(int codigoLivro, LocalDate dataLocacao) {
        super(codigoLivro);
        this.setCodigoLivro(codigoLivro);
        this.dataLocacao = dataLocacao;
    }
}
