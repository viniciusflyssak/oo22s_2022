package br.edu.utfpr;

import br.edu.utfpr.model.BancoDeDados;
import br.edu.utfpr.model.LocacaoService;

import java.io.IOException;
import java.util.Scanner;

/*
Criar programa orientado à objetos para solucionar os seguintes casos de uso:
- Será o controle de uma biblioteca
- Desenvolver método para a locação de livro
- deverá validar se livro está disponível
- Método para reserva de livro
- Validá se há alguma reserva para data e se estará disponível
- Método para devolução do livro
- Válida se a data da entrega é anterior a data máxima
- caso tenha vencido calcular 50 centavos ao dia até 20 reais, depois 1 real por dia

 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        LocacaoService locacaoService = new LocacaoService();
        int opcao = -1;
        while (opcao != 6){
            System.out.println("Sistema básico para locação");
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Locar um livro");
            System.out.println("2 - Reservar um livro");
            System.out.println("3 - Consultar disponibilidade livro");
            System.out.println("4 - Consultar locação por entidade");
            System.out.println("5 - Devolver livro");
            System.out.println("6 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    //locar um livro
                    locacaoService.locarLivro(scanner);
                    break;
                case 2:
                    //reservar um livro
                    locacaoService.reservarLivro(scanner);
                    break;
                case 3:
                    //consultar Disponibilidade livro
                    locacaoService.consultarDisponibilidadeLivro(scanner);
                    break;
                case 4:
                    //consultar locacao entidade
                    locacaoService.consultarLocacoesEntidade(scanner);
                    break;
                case 5:
                    //devolução livro
                    locacaoService.devolverLivro(scanner);
                    break;
                case 6:
                    System.out.println("Encerrando...");
                    //sair
                    break;
                default:
                    System.out.println("Opção inválida! reiniciando menu...");
            }
        }
    }
}
