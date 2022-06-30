package br.edu.utfpr.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        System.out.println("");
    }

    public void reservarLivro(Scanner scanner){
        System.out.println("Digite o código da pessoa que irá reservar o livro: ");
        int idPessoa = scanner.nextInt();
        System.out.println("Cliente selecionado: " + BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null).getNome());
        System.out.println("Digite o código do livro a ser reservado: ");
        int idLivro = scanner.nextInt();
        System.out.println("Livro selecionado: " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getNome() +
                ", quantidade disponível" + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel());
        System.out.println("Digite a data da reserva (ano-mês-dia): ");
        LocalDate dataReserva = LocalDate.parse(scanner.next(), DateTimeFormatter.ISO_LOCAL_DATE);
        LivroLocacao livroLocacao = new LivroLocacao(BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getCodigoLivro(), dataReserva);
        if (BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel() > 0) {
            BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).setQtdeDisponivel(BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel() - 1);
            BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null).addCodigoLivrosLocados(livroLocacao);
        }else{
            System.out.println("Livro com quantidade indisponível");
        }
        System.out.println("");
    }

    public void consultarDisponibilidadeLivro(Scanner scanner){
        System.out.println("Digite o código do livro que deseja consultar: ");
        int idLivro = scanner.nextInt();
        System.out.println("Livro selecionado: " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getNome() +
                ", quantidade disponível " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null).getQtdeDisponivel());
        System.out.println("");
    }

    public void consultarLocacoesEntidade(Scanner scanner){
        System.out.println("Digite o código da pessoa que deseja consultar: ");
        int idPessoa = scanner.nextInt();
        Pessoa pessoa =  BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null);
        System.out.println("Cliente selecionado: " + BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null).getNome());
        System.out.println("Livros locados/reservados: ");
        pessoa.getCodigoLivrosLocados().forEach(livroLocacao -> {
            System.out.println("ID do livro: " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == livroLocacao.getCodigoLivro()).findFirst().orElse(null).getCodigoLivro());
            System.out.println("Nome do livro: " + BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == livroLocacao.getCodigoLivro()).findFirst().orElse(null).getNome());
            System.out.println("Data que foi locado/reservado: " + livroLocacao.getDataLocacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        });
        System.out.println("");
    }

    public void devolverLivro(Scanner scanner) {
        System.out.println("Digite o código da pessoa que irá devolver o livro: ");
        int idPessoa = scanner.nextInt();
        Pessoa pessoa =  BancoDeDados.Pessoas.stream().filter(pessoa1 -> pessoa1.getCodigoPessoa() == idPessoa).findFirst().orElse(null);
        System.out.println("Cliente selecionado: " + pessoa.getNome());
        System.out.println("Digite o código do livro a ser devolvido: ");
        int idLivro = scanner.nextInt();
        Livro livroLocado = BancoDeDados.Livros.stream().filter(livro1 -> livro1.getCodigoLivro() == idLivro).findFirst().orElse(null);
        if (livroLocado == null){
            System.out.println("Livro não localizado");
        }else{
            System.out.println("Livro selecionado: " + livroLocado.getNome());
            pessoa.removeCodigoLivrosLocados(livroLocado.getCodigoLivro());
        }
        System.out.println("");
    }
}
