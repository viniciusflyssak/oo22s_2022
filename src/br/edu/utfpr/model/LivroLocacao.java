package br.edu.utfpr.model;

import java.util.Date;

public class LivroLocacao {
    private int codigoLivro;

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LivroLocacao(int codigoLivro, Date dataLocacao) {
        this.codigoLivro = codigoLivro;
        this.dataLocacao = dataLocacao;
    }

    private Date dataLocacao;
}
