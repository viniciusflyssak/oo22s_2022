package br.edu.utfpr.model;

import java.util.Currency;

public class LocacaoService {

    public void locarLivro(Pessoa pessoa, Livro livro){
        livro.setQtdeDisponivel(livro.getQtdeDisponivel() - 1);
    }

    public Double calculaMulta(Pessoa pessoa, Livro livro){
        return 0.0;
    }

    public boolean verificaLocado(Livro livro){
        return true;
    }
}
