package br.edu.utfpr.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Date;
import java.util.Scanner;

public class LocacaoService {

    public void locarLivro(Scanner scanner){
        System.out.println("Digite o código da pessoa que irá locar o livro: ");
        int idPessoa = scanner.nextInt();
        System.out.println("Cliente selecionado: " + BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null).getNome());
        System.out.println("Digite o código do livro a ser locado: ");
        int idLivro = scanner.nextInt();
        System.out.println("Livro selecionado: " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getNome() +
                ", quantidade disponível: " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel());
        LivroLocacao livroLocacao = new LivroLocacao(BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getCodigoLivro(), LocalDate.now());
        if (BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel() > 0) {
            BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).setQtdeDisponivel(BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel() - 1);
            BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null).addCodigoLivrosLocados(livroLocacao);
        }else{
            System.out.println("Livro com quantidade indisponível");
        }
    }

    public void reservarLivro(Scanner scanner){
        System.out.println("Digite o código da pessoa que irá reservar o livro: ");
        int idPessoa = scanner.nextInt();
        System.out.println("Cliente selecionado: " + BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null).getNome());
        System.out.println("Digite o código do livro a ser reservado: ");
        int idLivro = scanner.nextInt();
        System.out.println("Livro selecionado: " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getNome() +
                ", quantidade disponível" + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel());
        LivroLocacao livroLocacao = new LivroLocacao(BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getCodigoLivro(), LocalDate.now());
        if (BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel() > 0) {
            BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).setQtdeDisponivel(BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel() - 1);
            BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null).addCodigoLivrosLocados(livroLocacao);
        }else{
            System.out.println("Livro com quantidade indisponível");
        }
    }

    public void consultarLocacoesLivro(Scanner scanner){
        System.out.println("Digite o código do livro que deseja consultar: ");
        int idLivro = scanner.nextInt();
        System.out.println("Livro selecionado: " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getNome() +
                ", quantidade disponível" + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel());
    }

    public void consultarLocacoesEntidade(Scanner scanner){
        System.out.println("Digite o código da pessoa que deseja consultar: ");
        int idPessoa = scanner.nextInt();
        Pessoa pessoa =  BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null);
        System.out.println("Cliente selecionado: " + BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null).getNome());
        System.out.println("Livros locados/reservados: ");
        pessoa.getCodigoLivrosLocados().forEach(livroLocacao -> {
            System.out.println("Nome do livro: " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == livroLocacao.getCodigoLivro()).findFirst().orElse(null).getNome()
                    + " data que foi locado/reservado: " + livroLocacao.getDataLocacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        });
    }
}
