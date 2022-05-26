package br.edu.utfpr.model;

import java.util.Currency;
import java.util.Date;
import java.util.Scanner;

public class LocacaoService {

    public void locarLivro(Scanner scanner){
        System.out.println("Digite o código da pessoa que irá locar o livro: ");
        int idPessoa = scanner.nextInt();
        Pessoa pessoa = BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null);
        System.out.println("Cliente selecionado: " + pessoa.getNome());
        System.out.println("Digite o código do livro a ser locado: ");
        int idLivro = scanner.nextInt();
        Livro livro = BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null);
        System.out.println("Livro selecionado: " + livro.getNome() + ", quantidade disponível" + livro.getQtdeDisponivel());
        LivroLocacao livroLocacao = new LivroLocacao(livro.getCodigoLivro(), new Date());
        if (livro.getQtdeDisponivel() > 0) {
            livro.setQtdeDisponivel(livro.getQtdeDisponivel() - 1);
            pessoa.addCodigoLivrosLocados(livroLocacao);
        }else{
            System.out.println("Livro com quantidade indisponível");
        }
    }

    public Double calculaMulta(Pessoa pessoa, Livro livro){
        return 0.0;
    }

    public boolean verificaLocado(Livro livro){
        return true;
    }
}
