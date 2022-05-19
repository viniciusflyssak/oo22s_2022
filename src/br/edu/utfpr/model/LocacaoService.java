package br.edu.utfpr.model;

import java.util.Currency;
import java.util.Date;
import java.util.Scanner;

public class LocacaoService {

    public void locarLivro(Scanner scanner){
        BancoDeDados bancoDeDados = new BancoDeDados();
        System.out.println("Digite o código da pessoa que irá locar o livro: ");
        Pessoa pessoa = bancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == scanner.nextInt()).findFirst().orElse(null);
        System.out.println("Digite o código do livro a ser locado: ");
        Livro livro = bancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == scanner.nextInt()).findFirst().orElse(null);
        LivroLocacao livroLocacao = new LivroLocacao(livro.getCodigoLivro(), new Date());
        if (livro.getQtdeDisponivel() > 0) {
            livro.setQtdeDisponivel(livro.getQtdeDisponivel() - 1);
            pessoa.addCodigoLivrosLocados(livroLocacao);
        }else{
            System.out.println("Livro com quntidade indispoível");
        }
    }

    public Double calculaMulta(Pessoa pessoa, Livro livro){
        return 0.0;
    }

    public boolean verificaLocado(Livro livro){
        return true;
    }
}
